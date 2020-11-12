package springcloud.controller;

import com.demo.entity.CommonResult;
import com.demo.entity.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import springcloud.service.PaymentService;

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
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Resource
    private DiscoveryClient discoveryClient;
    @Value("$(server.port)")
    private String port;

    @GetMapping("/paymenetInfo/{id}")
    public String paymenetInfo(@PathVariable("id") Long id) {
        return paymentService.paymenetInfo(id);
    }

    @GetMapping("/paymenetInfoOut/{id}")
    public String paymenetInfoOut(@PathVariable("id") Long id) {
        return paymentService.paymenetInfoOut(id);
    }
}
