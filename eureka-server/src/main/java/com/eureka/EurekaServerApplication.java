package com.eureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    private static String value;

    @Value("${valueServer.testValue}")
    public void setValue(String value) {
        EurekaServerApplication.value = value;
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
        System.out.println(value);
    }

}
