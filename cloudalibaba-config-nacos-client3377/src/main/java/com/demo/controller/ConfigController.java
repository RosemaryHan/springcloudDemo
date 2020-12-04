package com.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rosemary
 * @title: ConfigController
 * @projectName cloud2020
 * @description: 获取配置文件信息，然后bootstrap总起，application后来
 * @date 2020/12/416:26
 */
@RestController
@RefreshScope //动态刷新
public class ConfigController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/getConfig")
    public String getConfigInfo() {
        return configInfo;
    }

}
