package com.baeyeon.book.test;

import com.baeyeon.book.pojo.Airline;
import com.baeyeon.book.service.AirlineService;
import com.baeyeon.book.service.impl.AirlineServiceImpl;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AirlineServiceImplTest {

    private AirlineService airlineService = new AirlineServiceImpl();

//    @Test
//    public void addAirline() {
//        airlineService.addAirline(new Airline("69C52","山东航空 69C52 空客510","2021-10-18 19:10:00","2021-10-18 20:50:00","泰安机场","遥墙机场","￥500","￥800","泰安","济南"));
//    }

    @Test
    public void deleteAirlineById() {
        airlineService.deleteAirlineById("69C52");
    }

//    @Test
//    public void updateAirline() {
//        airlineService.updateAirline(new Airline("69C52","山东航空 69C52 空客510","2021-10-28 19:10:00","2021-10-28 20:50:00","泰安机场","遥墙机场","￥500","￥800","泰安","济南"));
//    }

//    @Test
//    public void queryAirlineByInfo(Airline airline) {
//        System.out.println(airlineService.queryAirlineByInfo(airline));
//    }

//    @Test
//    public void queryAirlines() {
//        for (airlineService.queryAirlines()){
//            System.out.println(queryAirline);
//        }
//    }

    @Test
    public void queryAirlineById() {
        System.out.println(airlineService.queryAirlineById("3U8820"));
    }

//    @Test
//    public void cancelAirline() {
////        airlineDao.cancelAirline(new Airline("BK3294", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
//        airlineService.cancelAirline(new Airline("BK3294", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
//    }
}