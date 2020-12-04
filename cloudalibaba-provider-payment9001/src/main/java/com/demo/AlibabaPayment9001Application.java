package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Rosemary
 * @title: AlibabaPayment9001Application
 * @projectName cloud2020
 * @description: 阿里巴巴nacos生产者
 * @date 2020/12/415:06
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaPayment9001Application {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaPayment9001Application.class, args);
    }
}
