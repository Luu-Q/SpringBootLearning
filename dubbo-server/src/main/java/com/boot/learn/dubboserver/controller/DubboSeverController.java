package com.boot.learn.dubboserver.controller;

import com.boot.learn.dubboserver.product.DemoProd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dubbo")
public class DubboSeverController {

    @Autowired
    DemoProd demoProd;

    @GetMapping(value = "/test")
    public Object test(){
        return demoProd.getConsumer("路宁");
    }
}
