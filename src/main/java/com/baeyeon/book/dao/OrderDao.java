package com.baeyeon.book.dao;

import com.baeyeon.book.pojo.Order;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.List;

public interface OrderDao {
    public int updateOrderstatus(Order order);

    public int addOrder(Order order);

    public List<Order> queryOrderByInfo(Order order);

    public List<Order> queryOrderByUserid(Order order);

    public List<Order> queryOrders();
}
