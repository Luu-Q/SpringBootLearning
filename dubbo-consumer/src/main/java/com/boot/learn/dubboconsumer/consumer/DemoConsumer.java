package com.boot.learn.dubboconsumer.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.boot.learn.dubboserver.product.DemoProd;
import org.springframework.stereotype.Component;

@Component
public class DemoConsumer {

    @Reference(version = "1.0.0")
    DemoProd demoProd;

    public Object getConsumer(String string){
        return demoProd.getConsumer(string);
    }
}
