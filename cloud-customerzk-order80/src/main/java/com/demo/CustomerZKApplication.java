package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Rosemary
 * @title: CustomerZKApplication
 * @projectName cloud2020
 * @description: 使用Zookeeper的案例
 * @date 2020/11/1014:44
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CustomerZKApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerZKApplication.class, args);
        System.out.println("CustomerZKApplication启动成功");
    }
}
