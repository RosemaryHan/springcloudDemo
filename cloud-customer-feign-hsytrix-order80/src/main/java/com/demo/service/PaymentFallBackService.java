package com.demo.service;

import org.springframework.stereotype.Component;

/**
 * @author Rosemary
 * @title: PaymentFallBackService
 * @projectName cloud2020
 * @description: 这个类作为统一接口，统一设置了hsytrix的返回值
 * @date 2020/11/2316:00
 */
@Component
public class PaymentFallBackService implements HsytrixService  {
    @Override
    public String paymenetInfo(Long id) {
        return "------------PaymentFallBackService.paymenetInfo-------";
    }

    @Override
    public String paymenetInfoOut(Long id) {
        return  "------------PaymentFallBackService.paymenetInfoOut-------";
    }

}
