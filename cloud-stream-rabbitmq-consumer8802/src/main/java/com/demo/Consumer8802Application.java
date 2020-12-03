package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Rosemary
 * @title: Consumer8802Application
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/12/315:24
 */
@SpringBootApplication
public class Consumer8802Application {
    public static void main(String[] args) {
        SpringApplication.run(Consumer8802Application.class, args);
        System.out.println("====================启动成功===================");
    }
}
