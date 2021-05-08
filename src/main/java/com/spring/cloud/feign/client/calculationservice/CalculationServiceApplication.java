package com.spring.cloud.feign.client.calculationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CalculationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculationServiceApplication.class, args);
    }

}
