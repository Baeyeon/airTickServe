package com.baeyeon.book.dao.impl;

import com.baeyeon.book.dao.OrderDao;
import com.baeyeon.book.pojo.Order;

import java.util.List;

public class OrderDaoImpl extends BaseDao implements OrderDao {

    @Override
    public int updateOrderstatus(Order order){
        String sql = "update t_order set `status` = ? where `air_id` = ? and `pass_id` = ?";
        return update(sql,order.getStatus(),order.getAir_id(),order.getPass_id());
    }

    @Override
    public int addOrder(Order order) {
        String sql = "insert into t_order(`air_id`,`pass_id`,`price`,`user_id`,`status`) values(?,?,?,?,0)";
        return update(sql,order.getAir_id(),order.getPass_id(),order.getPrice(),order.getUser_id());
    }

    @Override
    public List<Order> queryOrderByInfo(Order order) {
        String sql = "select `air_id`,`airline`,`passengername`,`idType`,`tel`,`pass_id`,`takeoffPlace`,`takeoffAirport`,`arrivalPlace`,`arrivalAirport`,`takeoffDate`,`takeoffTime`,`arrivalDate`,`arrivalTime`,`price`,`user_id`,t_order.status from t_airline, t_passenger, t_order where t_airline.id = t_order.air_id and t_passenger.id = t_order.pass_id and air_id = ? and pass_id = ?";
        return queryForList(Order.class,sql,order.getAir_id(),order.getPass_id());
    }

    @Override
    public List<Order> queryOrderByUserid(Order order) {
        String sql = "select `air_id`,`airline`,`passengername`,`idType`,`tel`,`pass_id`,`takeoffPlace`,`takeoffAirport`,`arrivalPlace`,`arrivalAirport`,`takeoffDate`,`takeoffTime`,`arrivalDate`,`arrivalTime`,`price`,`user_id`,t_order.status from t_airline, t_passenger, t_order where t_airline.id = t_order.air_id and t_passenger.id = t_order.pass_id and user_id = ?";
        return queryForList(Order.class,sql,order.getUser_id());
    }

    @Override
    public List<Order> queryOrders() {
        String sql = "select `air_id`,`airline`,`passengername`,`idType`,`tel`,`pass_id`,`takeoffPlace`,`takeoffAirport`,`arrivalPlace`,`arrivalAirport`,`takeoffDate`,`takeoffTime`,`arrivalDate`,`arrivalTime`,`price`,`user_id`,t_order.status from t_airline, t_passenger, t_order where t_airline.id = t_order.air_id and t_passenger.id = t_order.pass_id";
        return queryForList(Order.class,sql);
    }
}
