package com.zt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class ApplicationZipkinService {
    public static void main( String[] args ) {
        SpringApplication.run(ApplicationZipkinService.class, args);
    }
}
