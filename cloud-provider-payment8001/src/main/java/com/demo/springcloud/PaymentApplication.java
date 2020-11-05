package com.demo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Rosemary
 * @title: PaymentApplication
 * @projectName cloud2020
 * @description: 支付者启动类
 * @date 2020/11/39:29
 */
@SpringBootApplication
public class PaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
        System.out.println("启动成功");
    }
}
