package com.baeyeon.book.test;

import com.baeyeon.book.dao.OrderDao;
import com.baeyeon.book.dao.impl.OrderDaoImpl;
import com.baeyeon.book.pojo.Airline;
import com.baeyeon.book.pojo.Order;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderDaoImplTest {

    private OrderDao orderDao = new OrderDaoImpl();

    @Test
    public void addOrder() {
        orderDao.addOrder(new Order("55667D",5,"300254100564582140","￥1800",0));
    }

    @Test
    public void queryOrderByInfo() {
        System.out.println(orderDao.queryOrderByInfo(new Order("68S523","11")));
    }

//    @Test
//    public void queryOrderByUserid(){
//        System.out.println(orderDao.queryOrderByUserid(new Order("2000000")));
//    }

    @Test
    public void queryOrders() {
        for (Order queryOrder : orderDao.queryOrders()){
            System.out.println(queryOrder);
        }
    }
}