package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Rosemary
 * @title: Config3377Application
 * @projectName cloud2020
 * @description: 基础版注册中心
 * @date 2020/12/416:21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Config3377Application {
    public static void main(String[] args) {
        SpringApplication.run(Config3377Application.class, args);
        System.out.println("-------启动成功---------");
    }
}
