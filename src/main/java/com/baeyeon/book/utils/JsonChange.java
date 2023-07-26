package com.baeyeon.book.utils;

import com.alibaba.fastjson.JSON;
import com.baeyeon.book.pojo.*;

public class JsonChange {
    public User JsonChangeJavaObjectUser(String str){
        User user = JSON.parseObject(str,User.class);
        return user;
    }

    public Airline JsonChangeJavaObjectAirline(String str){
        Airline airline = JSON.parseObject(str,Airline.class);
        return airline;
    }

    public String JsonChangeJavaObjectId(String str){
        String id = JSON.parseObject(str,String.class);
        return id;
    }

    public Passenger JsonChangeJavaObjectPassenger(String str){
        Passenger passenger = JSON.parseObject(str, Passenger.class);
        return passenger;
    }

    public Order JsonChangeJavaObjectOrder(String str){
        Order order = JSON.parseObject(str,Order.class);
        return order;
    }

    public Belonging JsonChangeJavaObjectBelonging(String str){
        Belonging belonging = JSON.parseObject(str,Belonging.class);
        return belonging;
    }

    public Order JsonChangeJavaObjectOrderstatus(String str) {
        Order order = JSON.parseObject(str,Order.class);
        return order;
    }

    public Timeconverter JsonChangeJavaObjectTimeconverter(String str) {
        Timeconverter timeconverter = JSON.parseObject(str,Timeconverter.class);
        return timeconverter;
    }
}
