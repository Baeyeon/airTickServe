package com.baeyeon.book.pojo;

public class Belonging {
    private Integer user_id;
    private String pass_id;

    //getter、setter
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

    //toString
    @Override
    public String toString() {
        return "{" +
                "\"user_id\":\"" + user_id + '\"' +
                ",\"pass_id\":\"" + pass_id + '\"' +
                '}';
    }

    //有参构造
    public Belonging(Integer user_id) {
        this.user_id = user_id;
    }

    public Belonging(Integer user_id, String pass_id) {
        this.user_id = user_id;
        this.pass_id = pass_id;
    }

    //无参构造
    public Belonging() {
    }
}
