package com.demo.springcloudeureka7000.eureka7000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka7000Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka7000Application.class, args);
        System.out.println("7001Eureka启动成功！！！！！！");
    }

}
