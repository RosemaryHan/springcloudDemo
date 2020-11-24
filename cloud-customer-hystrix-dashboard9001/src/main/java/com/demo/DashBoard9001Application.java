package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Rosemary
 * @title: DashBoard9001Application
 * @projectName cloud2020
 * @description: 搭建图形化hystrix界面
 * @date 2020/11/2416:59
 */
@EnableHystrixDashboard
@SpringBootApplication
public class DashBoard9001Application {
    public static void main(String[] args) {
        SpringApplication.run(DashBoard9001Application.class, args);
        System.out.println("----------DashBoard9001Application启动——————————————————");
    }
}
