package com.example.mspedidoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsPedidoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsPedidoServiceApplication.class, args);
    }

}
