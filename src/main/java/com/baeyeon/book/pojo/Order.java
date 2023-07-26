package com.baeyeon.book.pojo;

public class Order {
    private String air_id;
    private String pass_id;
    private Integer user_id;
    private String price;
    private Integer status; //订单状态，0表示未使用，1表示已使用

    private String airline;
    private String passengername;
    private Integer idType;
    private String tel;
    private String takeoffPlace;
    private String takeoffAirport;
    private String arrivalPlace;
    private String arrivalAirport;
    private String takeoffDate;
    private String takeoffTime;
    private String arrivalDate;
    private String arrivalTime;

    //getter、setter
    public String getAir_id() {
        return air_id;
    }

    public void setAir_id(String air_id) {
        this.air_id = air_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getPass_id() {
        return pass_id;
    }

    public void setPass_id(String pass_id) {
        this.pass_id = pass_id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getPassengername() {
        return passengername;
    }

    public void setPassengername(String passengername) {
        this.passengername = passengername;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTakeoffPlace() {
        return takeoffPlace;
    }

    public void setTakeoffPlace(String takeoffPlace) {
        this.takeoffPlace = takeoffPlace;
    }

    public String getTakeoffAirport() {
        return takeoffAirport;
    }

    public void setTakeoffAirport(String takeoffAirport) {
        this.takeoffAirport = takeoffAirport;
    }

    public String getArrivalPlace() {
        return arrivalPlace;
    }

    public void setArrivalPlace(String arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getTakeoffDate() {
        return takeoffDate;
    }

    public void setTakeoffDate(String takeoffDate) {
        this.takeoffDate = takeoffDate;
    }

    public String getTakeoffTime() {
        return takeoffTime;
    }

    public void setTakeoffTime(String takeoffTime) {
        this.takeoffTime = takeoffTime;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    //有参构造函数
    public Order(String air_id, Integer user_id,String pass_id, String price, Integer status) {
        this.air_id = air_id;
        this.user_id = user_id;
        this.pass_id = pass_id;
        this.price = price;
        this.status = status;
    }

    public Order(String air_id, String pass_id) {
        this.air_id = air_id;
        this.pass_id = pass_id;
    }

    public Order(String pass_id) {
        this.pass_id = pass_id;
    }

    public Order(String air_id, String pass_id, String price, Integer status, String airline, String passengername, Integer idType, String tel, String takeoffPlace, String takeoffAirport, String arrivalPlace, String arrivalAirport, String takeoffDate, String takeoffTime, String arrivalDate, String arrivalTime) {
        this.air_id = air_id;
        this.pass_id = pass_id;
        this.price = price;
        this.status = status;
        this.airline = airline;
        this.passengername = passengername;
        this.idType = idType;
        this.tel = tel;
        this.takeoffPlace = takeoffPlace;
        this.takeoffAirport = takeoffAirport;
        this.arrivalPlace = arrivalPlace;
        this.arrivalAirport = arrivalAirport;
        this.takeoffDate = takeoffDate;
        this.takeoffTime = takeoffTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
    }

    //无参构造函数
    public Order() {
    }

    //toString
    @Override
    public String toString() {
        return "{" +
                "\"air_id\":\"" + air_id + '\"' +
                ",\"user_id\":\"" + user_id + '\"' +
                ",\"pass_id\":\"" + pass_id + '\"' +
                ",\"price\":\"" + price + '\"' +
                ",\"status\":\"" + status + '\"' +
                ",\"airline\":\"" + airline + '\"' +
                ",\"passengername\":\"" + passengername + '\"' +
                ",\"idType\":\"" + idType + '\"' +
                ",\"tel\":\"" + tel + '\"' +
                ",\"takeoffPlace\":\"" + takeoffPlace + '\"' +
                ",\"takeoffAirport\":\"" + takeoffAirport + '\"' +
                ",\"arrivalPlace\":\"" + arrivalPlace + '\"' +
                ",\"arrivalAirport\":\"" + arrivalAirport + '\"' +
                ",\"takeoffDate\":\"" + takeoffDate + '\"' +
                ",\"takeoffTime\":\"" + takeoffTime + '\"' +
                ",\"arrivalDate\":\"" + arrivalDate + '\"' +
                ",\"arrivalTime\":\"" + arrivalTime + '\"' +
                '}';
    }
}
