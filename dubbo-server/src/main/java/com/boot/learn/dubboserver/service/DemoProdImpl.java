package com.boot.learn.dubboserver.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.learn.dubboserver.product.DemoProd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Service(version = "1.0.0")
@Component
public class DemoProdImpl implements DemoProd {

    @Autowired
    HttpServletRequest request;

    @Override
    public Object getConsumer(String name) {
        return "hello world:" +name+ "， --"+ request.getLocalPort();
    }
}
