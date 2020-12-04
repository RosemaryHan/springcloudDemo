package com.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rosemary
 * @title: Payment9001Controller
 * @projectName cloud2020
 * @date 2020/12/415:09
 */
@RestController
public class Payment9002Controller {
    @Value("${server.port}")
    private String servicePort;

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id")Integer id){
        return "nacos  "+id+" servicePort "+ servicePort;
    }
}
