package com.demo.controller;

import com.demo.entity.CommonResult;
import com.demo.entity.Payment;
import com.demo.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author Rosemary
 * @title: FeignController
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/11/1117:05
 */
@RestController
public class FeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @Value("$(service.port)")
    private String port;

    @GetMapping("/feign/getById/{id}")
    public CommonResult<Payment> getById(@PathVariable("id") Long id) {
        return paymentFeignService.getById(id);

    }

    /**
     * 　　* @description: 超时演示
     * 　　* @params
     * 　　* @return
     * 　　* @throws
     * 　　* @author Rosemary
     * 　　* @date 2020/11/11 17:26
     *
     */
    @GetMapping("/feign/timeout")
    public String timeout() {
        try {
            TimeUnit.SECONDS.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return port;
    }
}
