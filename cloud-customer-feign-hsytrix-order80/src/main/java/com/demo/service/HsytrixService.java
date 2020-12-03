package com.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Rosemary
 * @title: HsytrixService
 * @projectName cloud2020
 * @description: 转例调用
 * @date 2020/11/1817:21
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-HYSTRI-SERVICE",fallback = PaymentFallBackService.class)
public interface HsytrixService {

    @GetMapping("/paymenetInfo/{id}")
    String paymenetInfo(@PathVariable("id") Long id);

    @GetMapping("/paymenetInfoOut/{id}")
    String paymenetInfoOut(@PathVariable("id") Long id);

   }
