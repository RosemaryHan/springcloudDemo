package com.demo.springcloud.controller;

import com.demo.entity.CommonResult;
import com.demo.entity.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Rosemary
 * @title: OrderController
 * @projectName cloud2020
 * @description: 消费者
 * @date 2020/11/415:43
 */
@RestController
public class OrderController {

    //    public static final String PAYMENT_URL = "http://localhost:8001"; 单机版的
    //为了使用集群，将这部分路径改写，从eureka里面中获取
    public static final String PAYMENT_URL = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/comsumer/payment/getById/{id}")
    public CommonResult<Payment> create(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/getById/" + id, CommonResult.class);
    }


}
