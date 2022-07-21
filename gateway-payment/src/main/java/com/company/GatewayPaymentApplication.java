package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayPaymentApplication.class, args);
    }

}
