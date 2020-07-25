package com.longshihan.echarts.controller;

import com.longshihan.echarts.db.trace.TraceTime;
import com.longshihan.echarts.db.trace.TraceTimeDao;
import com.longshihan.echarts.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class TestController {
    @Autowired
    private TraceTimeDao traceTimeDao;
    //启动页面，空的
    @RequestMapping("/testEcharts")
    public String test(){
        //插入数据
        TraceTime traceTime=new TraceTime();
        traceTime.setTag(UUID.randomUUID().toString());
        traceTime.setMethodName("SSSS1");
        traceTime.setCost(12);
        traceTime.setDatetime("2019");
        traceTimeDao.save(traceTime);
        return "test";
    }

    //H5的echarts的获取数据
    @RequestMapping(value = "/testEcharts1",method= RequestMethod.GET,produces="application/json")
    @ResponseBody
    public List<TestModel> test1(){
        System.out.println("OOOO好");
        List<TestModel> testModels=new ArrayList<>();
        for (int i = 0; i <100; i++) {
            testModels.add(new TestModel(i+"",i));
        }
        System.out.println(testModels.toString());
        return testModels;
    }

    //请求接口上传存储数据
}
