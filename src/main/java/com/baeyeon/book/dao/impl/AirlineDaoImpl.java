package com.baeyeon.book.dao.impl;

import com.baeyeon.book.dao.AirlineDao;
import com.baeyeon.book.pojo.Airline;

import java.util.List;

public class AirlineDaoImpl extends BaseDao implements AirlineDao {
    @Override
    public int addAirline(Airline airline) {
        String sql = "insert into t_airline(`id`,`airline`,`takeoffTime`,`arrivalTime`,`takeoffAirport`,`arrivalAirport`,`economyPrice`,`businessPrice`,`takeoffPlace`,`arrivalPlace`,`takeoffDate`,`arrivalDate`,`ecomodMessage`,`busmodMessage`,`ecoleftTick`,`busleftTick`,`status`) " +
                "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,0)";
        return update(sql, airline.getId(),airline.getAirline(),airline.getTakeoffTime(),airline.getArrivalTime(),airline.getTakeoffAirport(),airline.getArrivalAirport(),airline.getEconomyPrice(),airline.getBusinessPrice(),airline.getTakeoffPlace(),airline.getArrivalPlace(),airline.getTakeoffDate(),airline.getArrivalDate(),airline.getEcomodMessage(),airline.getBusmodMessage(),airline.getEcoleftTick(),airline.getBusleftTick());
    }

    @Override
    public int deleteAirlineById(String id) {
        String sql = "delete from t_airline where id = ?";
        return update(sql,id);
    }

    @Override
    public int updateAirline(Airline airline) {
        String sql = "update t_airline set `airline`=?,`takeoffTime`=?,`arrivalTime`=?,`takeoffAirport`=?,`arrivalAirport`=?,`economyPrice`=?,`businessPrice`=?,`takeoffPlace`=?,`arrivalPlace`=?,`takeoffDate`=?,`arrivalDate`=?,`ecomodMessage`=?,`busmodMessage`=?,`ecoleftTick`=?,`busleftTick`=?,`status`=? where id = ?";
        return update(sql,airline.getAirline(),airline.getTakeoffTime(),airline.getArrivalTime(),airline.getTakeoffAirport(),airline.getArrivalAirport(),airline.getEconomyPrice(),airline.getBusinessPrice(),airline.getTakeoffPlace(),airline.getArrivalPlace(),airline.getTakeoffDate(),airline.getArrivalDate(),airline.getBusmodMessage(),airline.getEcomodMessage(),airline.getEcoleftTick(),airline.getBusleftTick(),0,airline.getId());
    }

    @Override
    public List<Airline> queryAirlineByInfo(Airline airline) {
        String sql = "select `id`,`airline`,`takeoffTime`,`arrivalTime`,`takeoffAirport`,`arrivalAirport`,`economyPrice`,`businessPrice`,`takeoffPlace`,`arrivalPlace`,`takeoffDate`,`arrivalDate`,`ecomodMessage`,`busmodMessage`,`ecoleftTick`,`busleftTick`,`status` from t_airline where takeoffPlace = ? and arrivalPlace = ? and takeoffDate = ?";
        return queryForList(Airline.class,sql,airline.getTakeoffPlace(),airline.getArrivalPlace(),airline.getTakeoffDate());
    }

    @Override
    public List<Airline> queryAirlines() {
        String sql = "select `id`,`airline`,`takeoffTime`,`arrivalTime`,`takeoffAirport`,`arrivalAirport`,`economyPrice`,`businessPrice`,`takeoffPlace`,`arrivalPlace`,`takeoffDate`,`arrivalDate`,`ecomodMessage`,`busmodMessage`,`ecoleftTick`,`busleftTick`,`status` from t_airline";
        return queryForList(Airline.class,sql);
    }

//    @Override
//    public Object queryTransferA(Airline airline) {
//        String sql = "select A.id\n" +
//                "from t_airline as A,t_airline as B\n" +
//                "where A.takeoffPlace = ? and B.arrivalPlace = ? and A.takeoffDate = ? and A.arrivalPlace = B.takeoffPlace and A.arrivalTime < B.takeoffTime";
//        return queryForSingleValue(sql,airline.getTakeoffPlace(),airline.getArrivalPlace(),airline.getTakeoffDate());
//    }


    @Override
    public List<Object[]> queryTransfer(Airline airline) {
        String sql = "select A.id,B.id\n" +
                "from t_airline as A,t_airline as B\n" +
                "where A.takeoffPlace = ? and B.arrivalPlace = ? and A.takeoffDate = ? and A.arrivalPlace = B.takeoffPlace and A.arrivalTime < B.takeoffTime";
        return queryforObjectList(sql,airline.getTakeoffPlace(),airline.getArrivalPlace(),airline.getTakeoffDate());
    }

    @Override
    public String queryTransferB(Airline airline) {
        String sql = "select B.id\n" +
                "from t_airline as A,t_airline as B\n" +
                "where A.takeoffPlace = ? and B.arrivalPlace = ? and A.takeoffDate = ? and A.arrivalPlace = B.takeoffPlace and A.arrivalTime < B.takeoffTime";
        return queryForSingleValue(sql,airline.getTakeoffPlace(),airline.getArrivalPlace(),airline.getTakeoffDate()).toString();
    }

    @Override
    public Airline queryAirlineById(String id){
        String sql = "select * from t_airline where id = ?";
        return queryForOne(Airline.class,sql,id);
    }

    @Override
    public int editTick(Airline airline){
        String sql = "update t_airline set `ecoleftTick` = ?,`busleftTick` = ? where `id` = ?";
        return update(sql,airline.getEcoleftTick(),airline.getBusleftTick(),airline.getId());
//"update t_airline set `airline`=?,`takeoffTime`=?,`arrivalTime`=?,`takeoffAirport`=?,`arrivalAirport`=?,`economyPrice`=?,`businessPrice`=?,`takeoffPlace`=?,`arrivalPlace`=?,`takeoffDate`=?,`arrivalDate`=?,`ecomodMessage`=?,`busmodMessage`=?,`ecoleftTick`=?,`busleftTick`=? where id = ?";
    }

    @Override
    public int cancelAirline(String id){
        String sql = "update t_airline set `status` = 1 where `id` = ?";
        return update(sql,id);
    }
}
