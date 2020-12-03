package com.deom.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rosemary
 * @title: ConfigController
 * @projectName cloud2020
 * @description: Springcloud config运用
 * @date 2020/12/115:24
 */
@RestController
public class ConfigController {
    private String configInfo = "adsf a";

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
