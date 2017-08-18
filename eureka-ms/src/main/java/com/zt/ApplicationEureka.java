package com.zt;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class ApplicationEureka
{
    public static void main( String[] args ){
        new SpringApplicationBuilder(ApplicationEureka.class).web(true).run(args);
    }
}
