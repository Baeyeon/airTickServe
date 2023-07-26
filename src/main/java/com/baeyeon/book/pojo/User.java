package com.baeyeon.book.pojo;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Integer status;
//getter
    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Integer getStatus() {
        return status;
    }

    //setter
    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    //toString

    @Override
    public String toString() {
        return "{" +
                "\"id\":\"" + id + '\"' +
                ",\"username\":\"" + username + '\"' +
                ",\"password\":\"" + password + '\"' +
                ",\"email\":\"" + email + '\"' +
                ",\"status\":\"" + status + '\"' +
                '}';
    }

    //有参构造函数
    public User(Integer id, String username, String password, String email,Integer status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.status = status;
    }

    public User(Integer id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //无参构造函数
    public User() {
    }
}
