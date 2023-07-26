package com.baeyeon.book.dao.impl;

import com.baeyeon.book.dao.PassengerDao;
import com.baeyeon.book.pojo.Passenger;

public class PassengerDaoImpl extends BaseDao implements PassengerDao {
    @Override
    public int addPassenger(Passenger passenger) {
        String sql = "insert into t_passenger (`id`,`idType`,`passengername`,`tel`) values(?,?,?,?)";
        return update(sql,passenger.getId(),passenger.getIdType(),passenger.getPassengername(),passenger.getTel());
    }
}
