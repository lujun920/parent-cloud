package com.zt.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = AccountClient.SERVICE_ID, fallback = AccountClientFallback.class)
//@FeignClient(name = AccountClient.SERVICE_ID)
public interface AccountClient {
    public String SERVICE_ID= "account-ms";
    @RequestMapping(value = "/getaccount/{id}", method = RequestMethod.GET)
    public String getAccount(@PathVariable("id") String id);
}
