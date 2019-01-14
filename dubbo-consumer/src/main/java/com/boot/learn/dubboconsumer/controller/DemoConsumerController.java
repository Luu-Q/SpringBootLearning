package com.boot.learn.dubboconsumer.controller;

import com.boot.learn.dubboconsumer.consumer.DemoConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/client")
public class DemoConsumerController {

    @Autowired
    DemoConsumer demoConsumer;

    @GetMapping(value = "/test")
    public Object test(){
        return demoConsumer.getConsumer("路宁");
    }
}
