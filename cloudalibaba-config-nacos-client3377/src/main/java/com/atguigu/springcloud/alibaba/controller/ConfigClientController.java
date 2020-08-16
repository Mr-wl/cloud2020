package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.alibaba.config.Scrop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Autowired
    private Scrop scrop;


    @GetMapping("/config/info")
    private String getConfigInfo(){
        return scrop.getConfigInfo();
    }
}

