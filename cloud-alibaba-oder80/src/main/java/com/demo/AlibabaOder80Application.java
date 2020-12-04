package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Rosemary
 * @title: AlibabaOder80Controller
 * @projectName cloud2020
 * @description: 阿里巴巴消费者80
 * @date 2020/12/415:24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaOder80Application {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaOder80Application.class, args);
    }
}
