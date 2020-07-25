package com.longshihan.echarts.model;

import java.io.Serializable;

public class TestModel implements Serializable {
    public TestModel(String date, int total) {
        this.date = date;
        this.total = total;
    }

    String date;
    int total;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "TestModel{" +
                "date='" + date + '\'' +
                ", total=" + total +
                '}';
    }
}
