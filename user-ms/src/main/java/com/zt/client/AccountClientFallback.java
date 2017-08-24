package com.zt.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AccountClientFallback implements AccountClient{
//public class AccountClientFallback {
    private static final Logger logger = LoggerFactory.getLogger(AccountClientFallback.class);

    @Override
    public String getAccount(String id) {
        return "AccountClientFallback服务异常....";
    }

}
