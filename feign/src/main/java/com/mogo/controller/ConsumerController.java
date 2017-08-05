package com.mogo.controller;

import com.mogo.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lxh on 2017/7/12.
 */
@RestController
public class ConsumerController {
    @Autowired
    ComputeClient computeClient;

    @Value("${info.profile}")
    private String info;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return computeClient.add(10, 20);
    }

    @RequestMapping("/health")
    public String home() {
        return "Hello world";
    }


    @RequestMapping("/info")
    public String from() {
        return this.info;
    }
}
