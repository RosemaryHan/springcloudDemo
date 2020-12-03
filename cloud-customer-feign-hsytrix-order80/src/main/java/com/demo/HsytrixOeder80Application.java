package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Rosemary
 * @title: HsytrixOeder
 * @projectName cloud2020
 * @description: 负载均衡配置
 * @date 2020/11/1817:14
 */
@SpringBootApplication
@EnableFeignClients
public class HsytrixOeder80Application {
    public static void main(String[] args) {
        SpringApplication.run(HsytrixOeder80Application.class, args);
        System.out.println("HsytrixOeder80Application启动成功");
    }
}
