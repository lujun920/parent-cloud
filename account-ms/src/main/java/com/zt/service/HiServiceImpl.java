package com.zt.service;

import com.zt.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiServiceImpl implements HiService{
    public String getUserName(String name){
        return userClient.getUserName(name);
    }
    @Autowired
    UserClient userClient;

}
