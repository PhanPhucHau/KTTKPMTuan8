package com.example.netfix_euruka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetfixEurukaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetfixEurukaApplication.class, args);
    }

}
