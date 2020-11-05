package com.demo.springcloud.com.demo.springcloud.controller;

import com.demo.entity.CommonResult;
import com.demo.entity.Payment;
import com.demo.springcloud.com.demo.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Rosemary
 * @title: PaymentController
 * @projectName cloud2020
 * @description: 支付者controller
 * @date 2020/11/310:13
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @GetMapping("/add")
    @ResponseBody
    public CommonResult<Integer> addPayment(Payment payment) {
        if (paymentService.save(payment) > 0) {
            return CommonResult.SUCCESS(1);
        } else {
            return CommonResult.ERROR();
        }
    }

    @GetMapping("/getById/{id}")
    @ResponseBody
    public CommonResult<Payment> getById(@PathVariable("id") Long id) {
        return CommonResult.SUCCESS(paymentService.getPaymentById(id));
    }
}
