package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Rosemary
 * @title: SentinelController
 * @projectName cloud2020
 * @description: Sentinel服务
 * @date 2020/12/2415:42
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelApplication {
	public static void main(String[] args) {
		SpringApplication.run(SentinelApplication.class, args);
		System.out.println("===============SentinelApplication启动成功===========");
	}
}
