package com.demo.springcloud.com.demo.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Rosemary
 * @date: 2020/9/30 17:52
 * @description:
 */
@Configuration//类似于configurationText.xml
public class ConfigBean {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
