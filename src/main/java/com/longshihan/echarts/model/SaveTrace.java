package com.longshihan.echarts.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SaveTrace implements Serializable {
    private List<TraceTime> traceTimes;

    public List<TraceTime> getTraceTimes() {
        return traceTimes;
    }

    public void setTraceTimes(List<TraceTime> traceTimes) {
        this.traceTimes = traceTimes;
    }
}
