package com.baeyeon.book.service.impl;

import com.baeyeon.book.dao.OrderDao;
import com.baeyeon.book.dao.impl.OrderDaoImpl;
import com.baeyeon.book.pojo.Order;
import com.baeyeon.book.service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao = new OrderDaoImpl();

    @Override
    public void editOrder(Order order) {
        orderDao.updateOrderstatus(order);
    }

    @Override
    public void addOrder(Order order) {
        orderDao.addOrder(order);
    }

    @Override
    public List<Order> queryOrderByInfo(Order order) {
        return orderDao.queryOrderByInfo(order);
    }

    @Override
    public List<Order> queryOrderByUserid(Order order) {
        return orderDao.queryOrderByUserid(order);
    }

    @Override
    public List<Order> queryOrders() {
        return orderDao.queryOrders();
    }
}
