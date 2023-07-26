package com.baeyeon.book.dao;

import com.baeyeon.book.pojo.Airline;

import java.util.List;

public interface AirlineDao {
    public int addAirline(Airline airline);

    public int deleteAirlineById(String id);

    public int updateAirline(Airline airline);

    public int editTick(Airline airline);

    public List<Airline> queryAirlineByInfo(Airline airline);

    public List<Airline> queryAirlines();

//    public Object queryTransferA(Airline airline);

    public List<Object[]> queryTransfer(Airline airline);

    public Airline queryAirlineById(String id);

    public String queryTransferB(Airline airline);

    public int cancelAirline(String id);
    }
