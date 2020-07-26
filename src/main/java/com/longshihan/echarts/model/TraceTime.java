package com.longshihan.echarts.model;

import lombok.Data;

@Data
public class TraceTime {
    private String tag;//唯一标识符
    private String methodName;
    private long cost;
    private String datetime;

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Object[] getObjects(){
        return new Object[]{getTag(),getMethodName(),getCost(),getDatetime()};
    }
}
