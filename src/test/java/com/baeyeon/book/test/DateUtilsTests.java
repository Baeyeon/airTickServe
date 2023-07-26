package com.baeyeon.book.test;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.baeyeon.book.utils.date.DateUtils;
import com.baeyeon.book.utils.date.ZoneIds;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author TimFruit
 * @date 19-11-2 下午5:50
 */
public class DateUtilsTests {


    @Test
    public void convertTimezoneBeijingTest(){
        Date now=new Date();
        Date target= DateUtils.convertTimezone(now, ZoneIds.BEIJING);
        Assert.assertEquals(now.getTime(), target.getTime());  //说明是北京时间
        System.out.println("北京时间: "+DateUtils.format(now));

        // 和UTC比较, 相差8个小时
        target=DateUtils.convertTimezone(now, ZoneIds.UTC);
        long sub=now.getTime()-target.getTime();
        Assert.assertEquals(8*60*60*1000, sub);
        System.out.println("UTC时间: "+DateUtils.format(target));
    }




    @Test
    public void convertTimezonePstNowTest(){
        // 太平洋时区：代表城市洛杉矶，与北京相差16小时；
        // 但由于实行夏令时, 夏季会快一个小时
        Date now=new Date();

        convertTimeZonePstTest(now);

    }


    @Test
    public void convertTimezonePstTest1(){
        // 太平洋时区：代表城市洛杉矶，与北京相差16小时；
        // 但由于实行夏令时, 夏季会快一个小时
        Date now=DateUtils.parse("2019-11-03 03:00:00");
        convertTimeZonePstTest(now);

        now=DateUtils.parse("2019-11-03 06:00:00");
        convertTimeZonePstTest(now);

        now=DateUtils.parse("2019-11-03 09:00:00");
        convertTimeZonePstTest(now);

        now=DateUtils.parse("2019-11-03 11:00:00");
        convertTimeZonePstTest(now);

        now=DateUtils.parse("2019-11-03 14:00:00");
        convertTimeZonePstTest(now);

        now=DateUtils.parse("2019-11-03 16:00:00");
        convertTimeZonePstTest(now);

        now=DateUtils.parse("2019-11-03 18:00:00");
        convertTimeZonePstTest(now);

        now=DateUtils.parse("2019-11-03 19:00:00");
        convertTimeZonePstTest(now);

        now=DateUtils.parse("2019-11-03 20:00:00");
        convertTimeZonePstTest(now);

        now=DateUtils.parse("2019-11-03 23:00:00");
        convertTimeZonePstTest(now);
    }


    private void convertTimeZonePstTest(Date sourceDate){
        //ZoneIds给出时区
        Date target=DateUtils.convertTimezone(sourceDate, ZoneIds.US_PST);
        long sub=sourceDate.getTime()-target.getTime();
//        System.out.println("北京时间与洛杉矶时间相差时间: "+sub/(60*60*1000) +" 小时");


        //由于有夏令时, 使用jdk提供的方法验证
        SimpleDateFormat pstSdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        pstSdf.setTimeZone(TimeZone.getTimeZone(ZoneIds.US_PST));
//        String expectFormat=pstSdf.format(sourceDate);

        String targetFormat=DateUtils.format(target);
        System.out.println("洛杉矶时间: "+targetFormat);
//        Assert.assertEquals(expectFormat,targetFormat);
    }









}
