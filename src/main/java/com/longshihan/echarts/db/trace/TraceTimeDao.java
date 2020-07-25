package com.longshihan.echarts.db.trace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TraceTimeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(TraceTime traceTime) {
        jdbcTemplate.update("insert into traceTime (tag,methodName,cost,datetime) values(?,?,?,?)"
                ,traceTime.getTag(),traceTime.getMethodName(),traceTime.getCost(),traceTime.getDatetime());
    }
}
