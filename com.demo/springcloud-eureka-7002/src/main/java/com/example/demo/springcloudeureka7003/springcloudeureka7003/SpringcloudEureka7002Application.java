package com.example.demo.springcloudeureka7003.springcloudeureka7003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEureka7002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEureka7002Application.class, args);
        System.out.println("7002Eureka启动成功！！！！！！");
    }

}
