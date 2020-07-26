package com.longshihan.echarts.controller;

import com.longshihan.echarts.model.TraceTime;
import com.longshihan.echarts.db.trace.TraceTimeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * H5的echats需要的接口
 */
@Controller
public class EchartsController {
    @Autowired
    private TraceTimeDao traceTimeDao;

    //H5的echarts的获取TraceTime数据
    @RequestMapping(value = "/traceTime",method= RequestMethod.GET,produces="application/json")
    @ResponseBody
    public List<TraceTime> test1(){
        List<TraceTime> traceTimes=traceTimeDao.getAll();
        if (traceTimes==null){
            traceTimes=new ArrayList<>();
        }
        return traceTimes;
    }
}
