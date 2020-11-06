package com.demo.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Rosemary
 * @title: ApplicationComtextConfig
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/11/416:50
 */
@Configuration
public class ApplicationComtextConfig {

    @Bean
    @LoadBalanced //这个注解赋予了RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


}
