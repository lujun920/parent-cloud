package com.zt.controller;

import com.zt.client.UserClient;
import com.zt.service.HiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

@RestController
public class ServiceController {
    private static final Logger logger = LoggerFactory.getLogger(ServiceController.class);
    @RequestMapping(value = "/getuser/{username}" ,method = RequestMethod.GET)
    public String add(@PathVariable("username") String username) {
        return userClient.getUserName(username);
    }

    @RequestMapping(value = "/getaccount/{id}" ,method = RequestMethod.GET)
    public String getAccount(@PathVariable("id") String id) {
        return "account id: "+ id;
    }

    @Autowired
    UserClient userClient;
}
