package com.demo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Rosemary
 * @title: OrderApplication
 * @projectName cloud2020
 * @description: 消费类80端口
 * @date 2020/11/415:40
 */
@SpringBootApplication
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
        System.out.println("启动成功");
    }
}
