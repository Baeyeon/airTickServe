package com.baeyeon.book.service;

import com.baeyeon.book.pojo.Airline;

import java.util.List;

public interface AirlineService {
    public void addAirline(Airline airline);

    public void deleteAirlineById(String id);

    public void updateAirline(Airline airline);

    public void editTick(Airline airline);

    public List<Airline> queryAirlineByInfo(Airline airline);

    public List<Airline> queryAirlines();

    public List<Object[]> queryTransfer(Airline airline);

    public String queryTransferB(Airline airline);

    public Airline queryAirlineById(String id);

    public void cancelAirline(String id);

}
