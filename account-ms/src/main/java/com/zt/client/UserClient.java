package com.zt.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = UserClient.SERVICE_ID, fallback = UserClientFallback.class)
public interface UserClient {
    public String SERVICE_ID= "user-ms";

    @RequestMapping(value = "/get/{username}", method = RequestMethod.GET)
    public String getUserName(@PathVariable("username") String username);
}
