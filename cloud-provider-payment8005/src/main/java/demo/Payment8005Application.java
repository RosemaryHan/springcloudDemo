package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Rosemary
 * @title: Payment8005Application
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/11/616:04
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8005Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment8005Application.class, args);
        System.out.println("启动成功");
    }
}
