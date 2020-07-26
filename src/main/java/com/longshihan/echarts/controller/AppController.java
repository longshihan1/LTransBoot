package com.longshihan.echarts.controller;

import com.longshihan.echarts.db.trace.TraceTimeDao;
import com.longshihan.echarts.model.APP;
import com.longshihan.echarts.model.SaveTrace;
import com.longshihan.echarts.model.TraceTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * App界面调用接口
 */
@Controller
public class AppController {
    @Autowired
    private TraceTimeDao traceTimeDao;

    @RequestMapping(value = "/testConnect",method= RequestMethod.GET,produces="application/json")
    @ResponseBody
    public APP testConnect(){
        System.out.println("执行接口：testConnect");
        return new APP(true,"网络正常");
    }

    //APP上传数据
    @PostMapping(value = "/saveAppInfo",produces="application/json")
    @ResponseBody
    public APP saveAppInfo(@RequestBody SaveTrace saveTrace){
        System.out.println("执行接口：saveAppInfo");
        if (saveTrace!=null){
            List<TraceTime> traceTimes=saveTrace.getTraceTimes();
            traceTimeDao.saveTracetimes(traceTimes);
        }
        return new APP(true,"上传成功");
    }
}
