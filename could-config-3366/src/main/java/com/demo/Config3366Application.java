package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Rosemary
 * @title: Config3366Application
 * @projectName cloud2020
 * @description: 配合bus和RMQ的使用
 * @date 2020/12/215:38
 */
@SpringBootApplication
@EnableEurekaClient
public class Config3366Application {
    public static void main(String[] args) {
        SpringApplication.run(Config3366Application.class, args);

        System.out.println("------------启动了---------");
    }
}
