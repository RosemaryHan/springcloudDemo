package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Rosemary
 * @title: Gateway9527Application
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/11/2617:06
 */
@SpringBootApplication
@EnableEurekaClient
public class Gateway9527Application {
    public static void main(String[] args) {
        SpringApplication.run(Gateway9527Application.class, args);
        System.out.println("Gateway9527Application启动成功");
    }
}
