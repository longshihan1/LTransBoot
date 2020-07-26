package com.longshihan.echarts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * index界面
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String test(){
        return "test";
    }
}
