package com.deom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Rosemary
 * @title: Config3355Application
 * @projectName cloud2020
 * @date 2020/11/3016:52
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudConfig3355Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfig3355Application.class, args);
    }
}

