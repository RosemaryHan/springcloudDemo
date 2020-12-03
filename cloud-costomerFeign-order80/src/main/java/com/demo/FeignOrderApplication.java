package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Rosemary
 * @title: FeignOrderApplication
 * @projectName cloud2020
 * @description: Feign配置
 * @date 2020/11/1116:39
 */
@SpringBootApplication
@EnableFeignClients
public class FeignOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignOrderApplication.class, args);
        System.out.println("FeignOrderApplication启动");
    }
}
