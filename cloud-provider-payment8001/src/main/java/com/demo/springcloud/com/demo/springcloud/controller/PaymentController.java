package com.demo.springcloud.com.demo.springcloud.controller;

import com.demo.entity.CommonResult;
import com.demo.entity.Payment;
import com.demo.springcloud.com.demo.springcloud.service.PaymentService;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
    @Resource
    private DiscoveryClient discoveryClient;


    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/add")
    @ResponseBody
    public CommonResult<String> addPayment(Payment payment) {
        if (paymentService.save(payment) > 0) {
            return CommonResult.SUCCESS(1 + serverPort);
        } else {
            return CommonResult.ERROR(serverPort);
        }
    }

    @GetMapping("/getById/{id}")
    @ResponseBody
    public CommonResult<Payment> getById(@PathVariable("id") Long id) {
        Payment paymentById = paymentService.getPaymentById(id);
        paymentById.setSerial(paymentById.getSerial() + serverPort);
        return CommonResult.SUCCESS(paymentById);
    }

    @GetMapping("/disservice")
    public Object getService() {
        List<String> services = discoveryClient.getServices();
        List<ServiceInstance> payment80011 = discoveryClient.getInstances("payment8001");
        System.out.println(payment80011);
        System.out.println(services.size());
        services.forEach(x-> System.out.print(x));
        return null;
    }
}
