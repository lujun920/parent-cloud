package com.zt.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zt.controller.service.HiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceController {
    private static final Logger logger = LoggerFactory.getLogger(ServiceController.class);


    @RequestMapping(value = "/test" ,method = RequestMethod.GET)
    public String add() {
        return service.getAdd("asd");
    }
    @Autowired
    HiService service;
}
