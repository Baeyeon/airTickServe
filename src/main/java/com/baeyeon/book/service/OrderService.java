package com.baeyeon.book.service;

import com.baeyeon.book.pojo.Order;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.List;

public interface OrderService {
    public void editOrder(Order order);

    public void addOrder(Order order);

    public List<Order> queryOrderByInfo(Order order);

    public List<Order> queryOrderByUserid(Order order);

    public List<Order> queryOrders();
}
