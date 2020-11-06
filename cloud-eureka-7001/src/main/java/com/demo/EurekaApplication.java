package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Rosemary
 * @title: EurekaApplication
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/11/517:20
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
        System.out.println("EurekaApplication启动成功");
    }
}
