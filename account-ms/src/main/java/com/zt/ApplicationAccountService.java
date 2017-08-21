package com.zt;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringCloudApplication
public class ApplicationAccountService
{
    public static void main( String[] args ){
        new SpringApplicationBuilder(ApplicationAccountService.class).web(true).run(args);

    }
}
