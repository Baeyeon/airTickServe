package com.baeyeon.book.test;

import com.baeyeon.book.pojo.Order;
import com.baeyeon.book.service.AirlineService;
import com.baeyeon.book.service.OrderService;
import com.baeyeon.book.service.impl.AirlineServiceImpl;
import com.baeyeon.book.service.impl.OrderServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderServiceImplTest {

    private OrderService orderService = new OrderServiceImpl();

    @Test
    public void addOrder(){
        orderService.addOrder(new Order("8S6634",4,"500107200305556981","￥650",1));
    }


    @Test
    public void queryOrderByInfo() {
                System.out.println(orderService.queryOrderByInfo(new Order("9C8875",5,"500201200210094560",null,null)));
    }

    @Test
    public void queryOrderByPassid(){
        System.out.println(orderService.queryOrderByUserid(new Order("2000000")));
    }

    @Test
    public void queryOrders() {
        for (Order queryOrder: orderService.queryOrders()){
            System.out.println(queryOrder);
        }
    }
}