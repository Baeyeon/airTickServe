package com.baeyeon.book.pojo;

public class Passenger {
    private String id;
    private Integer idType;
    private String passengername;
    private String tel;

    //getter、setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getPassengername() {
        return passengername;
    }

    public void setPassengername(String passengername) {
        this.passengername = passengername;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    //有参构造函数
    public Passenger(String id, Integer idType, String passengername, String tel) {
        this.id = id;
        this.idType = idType;
        this.passengername = passengername;
        this.tel = tel;
    }

    //无参构造函数
    public Passenger() {
    }

    //toString

    @Override
    public String toString() {
        return "{" +
                "\"id\":\"" + id + '\"' +
                ",\"idType\":\"" + idType + '\"' +
                ",\"passengername\":\"" + passengername + '\"' +
                ",\"tel\":\"" + tel + '\"' +
                '}';
    }
}
