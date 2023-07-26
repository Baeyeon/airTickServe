package com.baeyeon.book.service.impl;

import com.baeyeon.book.dao.PassengerDao;
import com.baeyeon.book.dao.impl.PassengerDaoImpl;
import com.baeyeon.book.pojo.Passenger;
import com.baeyeon.book.service.PassengerService;

public class PassengerServiceImpl implements PassengerService {

    PassengerDao passengerDao = new PassengerDaoImpl();

    @Override
    public void addPassenger(Passenger passenger) {
        passengerDao.addPassenger(passenger);
    }
}
