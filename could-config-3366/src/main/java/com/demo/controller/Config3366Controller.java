package com.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rosemary
 * @title: Config3366Controller
 * @projectName cloud2020
 * @date 2020/12/215:50
 */
@RestController
public class Config3366Controller {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String configInfo() {
        return serverPort + "-----" + configInfo;
    }
}
