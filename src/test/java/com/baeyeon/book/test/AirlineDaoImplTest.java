package com.baeyeon.book.test;

import com.baeyeon.book.dao.AirlineDao;
import com.baeyeon.book.dao.impl.AirlineDaoImpl;
import com.baeyeon.book.pojo.Airline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AirlineDaoImplTest {

    private AirlineDao airlineDao = new AirlineDaoImpl();

//    @Test
//    public void addAirline() {
////            public Airline(String id, String airline, String takeoffTime, String arrivalTime, String takeoffAirport, String arrivalAirport, String economyPrice, String businessPrice, String takeoffPlace, String arrivalPlace) {
//        airlineDao.addAirline(new Airline("87S69", "000", "19:10:00", "20:50:00", "大兴机场", "香港国际机场", "￥1200", "￥1900", "北京", "香港", "2020-12-02", "2020-12-02", "sasasasa", "asasasasa", 5, 10));
//    }
//
//    @Test
//    public void deleteAirlineById() {
//        airlineDao.deleteAirlineById("87S69");
//    }
//
//    // public Airline(String id, String airline, String takeoffTime, String arrivalTime, String takeoffAirport, String arrivalAirport, String economyPrice, String businessPrice, String takeoffPlace, String arrivalPlace,String takeoffDate,String arrivalDate,String ecomodMessage,String busmodMessage,Integer ecoleftTick,Integer busleftTick) {
//    @Test
//    public void updateAirline() {
//        airlineDao.updateAirline(new Airline("87S69", "000", "19:10:00", "20:50:00", "大兴机场", "香港国际机场", "￥1200", "￥1900", "北京", "香港", "2020-12-02", "2020-12-02", "sasasasa", "asasasasa", 5, 10));
//    }
//
////    @Test
////    public void queryAirlineByInfo(Airline airline) {
////        System.out.println(airlineDao.queryAirlineByInfo(airline));
////    }
//
//    @Test
//    public void queryTransfer() {
//        List<Object[]> list= airlineDao.queryTransfer(new Airline(null, null, null, null, null, null, null, null, "济南", "上海", "2021-09-06", null, null, null, null, null));
//        for( Object[] objs  : list){
//            for(Object obj : objs)
//                System.out.print(obj+"-");
//            }
//            System.out.println();
//        }
//
//
//    @Test
//    public void queryAirlines() {
//        for (Airline queryAirline : airlineDao.queryAirlines()) {
//            System.out.println(queryAirline);
//        }
//    }
//
//    @Test
//    public void queryAirlineById() {
//        System.out.println(airlineDao.queryAirlineById("3U8820"));
//    }
//
//    @Test
//    public void subtractTick(){
//        airlineDao.editTick(new Airline("MU6364", null, null, null, null, null, null, null, null, null, null, null, null, null, 8, 4));
//    }

    //    BK3294
//    @Test
//    public void cancelAirline() {
//        airlineDao.cancelAirline(new Airline("BK3294", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
//    }

    @Test
    public void queryTransferB() {
        String B_id = airlineDao.queryTransferB(new Airline(null, null, null, null, null, null, null, null, "济南", "上海", "2021-09-18", null, null, null, null, null, null));
        System.out.println(B_id);
    }
}