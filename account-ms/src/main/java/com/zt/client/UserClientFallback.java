package com.zt.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient{
//public class UserClientFallback{
    private static final Logger logger = LoggerFactory.getLogger(UserClientFallback.class);
    @Override
    public String getUserName(String username) {
        return "UserClientFallback服务异常....";
    }
}
