package com.baeyeon.book.pojo;

import java.time.DateTimeException;

public class Airline {
    private String id;
    private String airline;
    private String takeoffTime;
    private String arrivalTime;
    private String takeoffAirport;
    private String arrivalAirport;
    private String economyPrice;
    private String businessPrice;
    private String takeoffPlace;
    private String arrivalPlace;
    private String takeoffDate;
    private String arrivalDate;
    private String ecomodMessage;
    private String busmodMessage;
    private Integer ecoleftTick;
    private Integer busleftTick;
    private Integer status;

    //getter、setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getTakeoffTime() {
        return takeoffTime;
    }

    public void setTakeoffTime(String takeoffTime) {
        this.takeoffTime = takeoffTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getTakeoffAirport() {
        return takeoffAirport;
    }

    public void setTakeoffAirport(String takeoffAirport) {
        this.takeoffAirport = takeoffAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getEconomyPrice() {
        return economyPrice;
    }

    public void setEconomyPrice(String economyPrice) {
        this.economyPrice = economyPrice;
    }

    public String getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(String businessPrice) {
        this.businessPrice = businessPrice;
    }

    public String getTakeoffPlace() {
        return takeoffPlace;
    }

    public void setTakeoffPlace(String takeoffPlace) {
        this.takeoffPlace = takeoffPlace;
    }

    public String getArrivalPlace() {
        return arrivalPlace;
    }

    public void setArrivalPlace(String arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    public String getTakeoffDate() {
        return takeoffDate;
    }

    public void setTakeoffDate(String takeoffDate) {
        this.takeoffDate = takeoffDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getEcomodMessage() {
        return ecomodMessage;
    }

    public void setEcomodMessage(String ecomodMessage) {
        this.ecomodMessage = ecomodMessage;
    }

    public String getBusmodMessage() {
        return busmodMessage;
    }

    public void setBusmodMessage(String busmodMessage) {
        this.busmodMessage = busmodMessage;
    }

    public Integer getEcoleftTick() {
        return ecoleftTick;
    }

    public void setEcoleftTick(Integer ecoleftTick) {
        this.ecoleftTick = ecoleftTick;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBusleftTick() {
        return busleftTick;
    }

    public void setBusleftTick(Integer busleftTick) {
        this.busleftTick = busleftTick;
    }

    //有参构造函数


    public Airline(String id, String airline, String takeoffTime, String arrivalTime, String takeoffAirport, String arrivalAirport, String economyPrice, String businessPrice, String takeoffPlace, String arrivalPlace,String takeoffDate,String arrivalDate,String ecomodMessage,String busmodMessage,Integer ecoleftTick,Integer busleftTick,Integer status) {
        this.id = id;
        this.airline = airline;
        this.takeoffTime = takeoffTime;
        this.arrivalTime = arrivalTime;
        this.takeoffAirport = takeoffAirport;
        this.arrivalAirport = arrivalAirport;
        this.economyPrice = economyPrice;
        this.businessPrice = businessPrice;
        this.takeoffPlace = takeoffPlace;
        this.arrivalPlace = arrivalPlace;
        this.takeoffDate = takeoffDate;
        this.arrivalDate = arrivalDate;
        this.ecomodMessage = ecomodMessage;
        this.busmodMessage = busmodMessage;
        this.ecoleftTick = ecoleftTick;
        this.busleftTick = busleftTick;
        this.status = status;
    }

    public Airline(String takeoffPlace, String arrivalPlace, String takeoffDate) {
        this.takeoffPlace = takeoffPlace;
        this.arrivalPlace = arrivalPlace;
        this.takeoffDate = takeoffDate;
    }

    public Airline(String id){
        this.id = id;
    }

    //无参构造函数
    public Airline() {
    }

    //toString

    @Override
    public String toString() {
        return "{" +
                "\"id\":\"" + id + '\"' +
                ",\"airline\":\"" + airline + '\"' +
                ",\"takeoffTime\":\"" + takeoffTime + '\"' +
                ",\"arrivalTime\":\"" + arrivalTime + '\"' +
                ",\"takeoffAirport\":\"" + takeoffAirport + '\"' +
                ",\"arrivalAirport\":\"" + arrivalAirport + '\"' +
                ",\"economyPrice\":\"" + economyPrice + '\"' +
                ",\"businessPrice\":\"" + businessPrice + '\"' +
                ",\"takeoffPlace\":\"" + takeoffPlace + '\"' +
                ",\"arrivalPlace\":\"" + arrivalPlace + '\"' +
                ",\"takeoffDate\":\"" + takeoffDate + '\"' +
                ",\"arrivalDate\":\"" + arrivalDate + '\"' +
                ",\"ecomodMessage\":\"" + ecomodMessage + '\"' +
                ",\"busmodMessage\":\"" + busmodMessage + '\"' +
                ",\"ecoleftTick\":\"" + ecoleftTick + '\"' +
                ",\"busleftTick\":\"" + busleftTick + '\"' +
                ",\"status\":\"" + status + '\"' +
                '}';
    }
}
