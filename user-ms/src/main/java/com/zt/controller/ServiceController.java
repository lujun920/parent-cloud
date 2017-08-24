package com.zt.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zt.service.HiService;
import com.zt.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceController {
    private static final Logger logger = LoggerFactory.getLogger(ServiceController.class);


    @RequestMapping(value = "/test" ,method = RequestMethod.GET)
    public String add() {
        return service.getAdd("asd");
    }

    @RequestMapping(value = "/get/{username}" ,method = RequestMethod.GET)
    public String get(@PathVariable String username) {
        return userService.getUserName(username);
    }
    @RequestMapping(value = "/getaccount/{id}" ,method = RequestMethod.GET)
    public String getAccount(@PathVariable String id) {
        return userService.getAccount(id);
    }
    @Autowired
    HiService service;
    @Autowired
    UserService userService;
}
