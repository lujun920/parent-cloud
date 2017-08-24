package com.zt.service;

import com.zt.client.AccountClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(String name) {
        return "username is: "+ name;
    }
    @Override
    public String  getAccount(String  id){
        return accountClient.getAccount(id);
    }

    @Autowired
    private AccountClient accountClient;
}
