package com.baeyeon.book.service.impl;

import com.baeyeon.book.dao.AirlineDao;
import com.baeyeon.book.dao.impl.AirlineDaoImpl;
import com.baeyeon.book.pojo.Airline;
import com.baeyeon.book.service.AirlineService;

import java.util.List;

public class AirlineServiceImpl implements AirlineService {

    //service依赖Dao操作访问数据库
    private AirlineDao airlineDao = new AirlineDaoImpl();

    @Override
    public void addAirline(Airline airline) {
        airlineDao.addAirline(airline);
    }

    @Override
    public void editTick(Airline airline){
        airlineDao.editTick(airline);
    }


    @Override
    public void deleteAirlineById(String id) {
        airlineDao.deleteAirlineById(id);
    }

    @Override
    public void updateAirline(Airline airline) {
        airlineDao.updateAirline(airline);
    }

    @Override
    public List<Airline> queryAirlineByInfo(Airline airline) {
        return airlineDao.queryAirlineByInfo(airline);
    }

    @Override
    public List<Airline> queryAirlines() {
        return airlineDao.queryAirlines();
    }

    @Override
    public List<Object[]> queryTransfer(Airline airline) {
        return airlineDao.queryTransfer(airline);
    }

    @Override
    public Airline queryAirlineById(String id) {
        return airlineDao.queryAirlineById(id);
    }

    @Override
    public void cancelAirline(String id) {
        airlineDao.cancelAirline(id);
    }

    @Override
    public String queryTransferB(Airline airline) {
        return airlineDao.queryTransferB(airline);
    }
}
