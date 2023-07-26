package com.baeyeon.book.pojo;

public class Timeconverter {
    private String sourcetime;
    private String timezone;

    //getter、setter
    public String getSourcetime() {
        return sourcetime;
    }

    public void setSourcetime(String sourcetime) {
        this.sourcetime = sourcetime;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    //构造函数

    public Timeconverter(String sourcetime, String timezone) {
        this.sourcetime = sourcetime;
        this.timezone = timezone;
    }

    public Timeconverter() {
    }
}
