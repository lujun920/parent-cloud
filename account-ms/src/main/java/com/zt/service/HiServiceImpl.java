package com.zt.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HiServiceImpl implements HiService{
    @HystrixCommand(fallbackMethod = "hiError")
    public String getAdd1(String name){
//        return restTemplate.getForEntity("http://user-ms/test", String.class).getBody();
        return "getAdd1";
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

    @Autowired
    RestTemplate restTemplate;
}
