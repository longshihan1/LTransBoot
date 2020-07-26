package com.longshihan.echarts.db.trace;

import com.longshihan.echarts.model.TraceTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TraceTimeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(TraceTime traceTime) {
        jdbcTemplate.update("insert into traceTime (tag,methodName,cost,datetime) values(?,?,?,?)"
                , traceTime.getTag(), traceTime.getMethodName(), traceTime.getCost(), traceTime.getDatetime());
    }

    public List<TraceTime> getAll() {
        List<TraceTime> traceTimes = jdbcTemplate.query(" SELECT * FROM traceTime", new Object[]{}
                , new BeanPropertyRowMapper<TraceTime>(TraceTime.class));
        return traceTimes;
    }

    public void saveTracetimes(List<TraceTime> traceTimes) {
        List<Object[]> batchArgs = new ArrayList<Object[]>();
        for (int i = 0; i < traceTimes.size(); i++) {
            batchArgs.add(traceTimes.get(i).getObjects());
        }
        jdbcTemplate.batchUpdate("insert into traceTime (tag,methodName,cost,datetime) values(?,?,?,?)", batchArgs);
    }
}
