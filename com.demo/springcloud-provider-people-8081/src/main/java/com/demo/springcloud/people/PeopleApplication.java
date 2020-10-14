package com.demo.springcloud.people;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: Rosemary
 * @date: 2020/9/30 1:27
 * @description:启动类
 */
@SpringBootApplication
@EnableEurekaClient
public class PeopleApplication {
    public static void main(String[] args) {
        SpringApplication.run(PeopleApplication.class, args);
        System.out.println("人民服务类启动！！！！！");
    }
}
