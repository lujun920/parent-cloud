package com.zt.controller.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HiServiceImpl implements HiService{
    @HystrixCommand(fallbackMethod = "hiError")
    public String getAdd(String name){
//        return restTemplate.getForEntity("http://account-ms/add?a=10&b=20", String.class).getBody();
        return "getAdd";
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

    @Autowired
    RestTemplate restTemplate;
}
