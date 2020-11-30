package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Rosemary
 * @title: GatewayCode9527Application
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/11/2716:24
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayCode9527Application {
    public static void main(String[] args) {
        SpringApplication.run(GatewayCode9527Application.class, args);
        System.out.print("-----------GatewayCode9527Application启动--------------");
    }
}
