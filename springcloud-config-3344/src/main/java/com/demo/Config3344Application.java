package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Rosemary
 * @title: Config3344Application
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/11/3015:24
 */
@SpringBootApplication
@EnableConfigServer
public class Config3344Application {
    public static void main(String[] args) {
        SpringApplication.run(Config3344Application.class, args);
        System.out.println("----------------启动成功------------------");
    }

}
