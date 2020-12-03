package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Rosemary
 * @title: StreamProvider8801Application
 * @projectName cloud2020
 * @description: 配合cloud stream进行消息管理
 * @date 2020/12/217:05
 */
@SpringBootApplication
public class StreamProvider8801Application {
    public static void main(String[] args) {
        SpringApplication.run(StreamProvider8801Application.class, args);
        System.out.println("===========StreamProvider8801Application启动成功====================");
    }
}
