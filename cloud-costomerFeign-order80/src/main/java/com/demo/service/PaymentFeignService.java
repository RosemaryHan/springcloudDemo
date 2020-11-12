package com.demo.service;

import com.demo.entity.CommonResult;
import com.demo.entity.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Rosemary
 * @title: PaymentFeignService
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/11/1116:52
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("/payment/getById/{id}")
    public CommonResult<Payment> getById(@PathVariable("id") Long id) ;
}
