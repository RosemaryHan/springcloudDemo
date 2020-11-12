package demo.springcloud.controller;

import com.demo.entity.CommonResult;
import com.demo.entity.Payment;
import demo.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.UUID;

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

    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/consul")
    public String paymentConsul() {
        return "springcloud with consul:" + port + UUID.randomUUID().toString();
    }

    @Resource
    private PaymentService paymentService;

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
}
