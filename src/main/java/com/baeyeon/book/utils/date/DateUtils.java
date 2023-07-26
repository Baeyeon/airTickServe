package com.baeyeon.book.utils.date;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import org.junit.Assert;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateUtils {

    /**
     * 默认转换成"yyyy-MM-dd HH:mm:ss"格式
     * @param date
     * @return
     */
    public static String format(Date date){
        return format(date, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 根据特定格式格式化日期
     *
     * @param date   被格式化的日期
     * @param format 日期格式，常用格式见： {@link DatePattern}
     * @return 格式化后的字符串
     */
    public static String format(Date date, String format){
        return DateUtil.format(date, format); //使用hutool工具类
    }

    /**
     * 默认dateStr符合"yyyy-MM-dd HH:mm:ss"格式
     * @param dateStr
     * @return
     */
    public static DateTime parse(String dateStr){
        return parse(dateStr, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 将特定格式的日期转换为Date对象
     *
     * @param dateStr 特定格式的日期
     * @param format  格式，例如yyyy-MM-dd  ，常用格式见： {@link DatePattern}
     * @return 日期对象
     */
    public static DateTime parse(String dateStr, String format){
        return DateUtil.parse(dateStr, format);
    }

    /**
     * 将本地时间, 转换成目标时区的时间
     * @param sourceDate
     * @param targetZoneId {@link ZoneIds}
     * @return
     */
    public static Date convertTimezone(Date sourceDate, String targetZoneId){
        return convertTimezone(sourceDate, TimeZone.getTimeZone(targetZoneId));
    }

    public static Date convertTimezone(Date sourceDate, String sourceZoneId, String targetZoneId){
        TimeZone sourceTimeZone=TimeZone.getTimeZone(sourceZoneId);
        TimeZone targetTimeZone=TimeZone.getTimeZone(targetZoneId);

        return convertTimezone(sourceDate, sourceTimeZone, targetTimeZone);
    }

    /**
     * 将本地时间,转换成对应时区的时间
     * @param localDate
     * @param targetTimezone 转换成目标时区所在的时间
     * @return
     */
    public static Date convertTimezone(Date localDate, TimeZone targetTimezone){
        return convertTimezone(localDate, TimeZone.getDefault(), targetTimezone);
    }

    /**
     * 将sourceDate转换成指定时区的时间
     * @param sourceDate
     * @param sourceTimezone sourceDate所在的时区
     * @param targetTimezone 转化成目标时间所在的时区
     * @return
     */
    public static Date convertTimezone(Date sourceDate, TimeZone sourceTimezone, TimeZone targetTimezone){


        // targetDate - sourceDate=targetTimezone-sourceTimezone
        // --->
        // targetDate=sourceDate + (targetTimezone-sourceTimezone)


        Calendar calendar=Calendar.getInstance();
        long sourceTime=sourceDate.getTime(); // date.getTime() 为时间戳, 为格林尼治到系统现在的时间差


        calendar.setTimeZone(sourceTimezone);
        calendar.setTimeInMillis(sourceTime);// 设置之后,calendar会计算各种filed对应的值,并保存

        //获取源时区的到UTC的时区差
        int sourceZoneOffset=calendar.get(Calendar.ZONE_OFFSET);


        calendar.setTimeZone(targetTimezone);
        calendar.setTimeInMillis(sourceTime);

        int targetZoneOffset=calendar.get(Calendar.ZONE_OFFSET);
        int targetDaylightOffset=calendar.get(Calendar.DST_OFFSET); // 夏令时


        long targetTime=sourceTime+ (targetZoneOffset+targetDaylightOffset) -sourceZoneOffset;

        return new Date(targetTime);
    }

    public static String convertTimezoneREAL(Date sourceDate,String timezone){
        //ZoneIds给出时区
        Date target=DateUtils.convertTimezone(sourceDate, timezone);
        long sub=sourceDate.getTime()-target.getTime();
//        System.out.println("北京时间与洛杉矶时间相差时间: "+sub/(60*60*1000) +" 小时");


        //由于有夏令时, 使用jdk提供的方法验证
        SimpleDateFormat pstSdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        pstSdf.setTimeZone(TimeZone.getTimeZone(timezone));
//        String expectFormat=pstSdf.format(sourceDate);
        return DateUtils.format(target);
    }


    public static void main(String[] args) {
        Date now = DateUtils.parse("2021-09-06 18:01:00");
        Date daterst = DateUtils.convertTimezone(now,"Europe/Paris");
        System.out.println(daterst);
    }

//    private void convertTimeZone(Date sourceDate,String zoneId){
//        //ZoneIds给出时区
//        Date target=DateUtils.convertTimezone(sourceDate, zoneId);
//        long sub=sourceDate.getTime()-target.getTime();
////        System.out.println("北京时间与洛杉矶时间相差时间: "+sub/(60*60*1000) +" 小时");
//
//
//        //由于有夏令时, 使用jdk提供的方法验证
//        SimpleDateFormat pstSdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        pstSdf.setTimeZone(TimeZone.getTimeZone(zoneId));
//        String expectFormat=pstSdf.format(sourceDate);
//
//        String targetFormat=DateUtils.format(target);
//        System.out.println("转换后时间: "+targetFormat);
//        Assert.assertEquals(expectFormat,targetFormat);
//    }









}
