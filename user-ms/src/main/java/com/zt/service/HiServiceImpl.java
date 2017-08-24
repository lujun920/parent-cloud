package com.zt.service;

import org.springframework.stereotype.Service;

@Service
public class HiServiceImpl implements HiService {
//    @HystrixCommand(fallbackMethod = "hiError")
    public String getAdd(String name){
//        return restTemplate.getForEntity("http://account-ms/add?a=10&b=20", String.class).getBody();
        return "user-ms getAdd";
    }

//    public String hiError(String name) {
//        return "hi,"+name+",sorry,error!";
//    }

//    @Autowired
//    RestTemplate restTemplate;
}
