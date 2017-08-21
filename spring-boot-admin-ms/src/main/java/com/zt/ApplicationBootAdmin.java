package com.zt;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@EnableAdminServer
@SpringCloudApplication
public class ApplicationBootAdmin {
    public static void main( String[] args ) {
        SpringApplication.run(ApplicationBootAdmin.class, args);
    }
}
