package com.zt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Hello world!
 *
 */
@EnableTurbine
@EnableHystrixDashboard
@SpringBootApplication
public class ApplicationHystrixService
{
    public static void main( String[] args )
    {
        SpringApplication.run(ApplicationHystrixService.class, args);
    }
}
