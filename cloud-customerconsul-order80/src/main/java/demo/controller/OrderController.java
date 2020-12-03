package demo.controller;


import com.demo.entity.CommonResult;
import com.demo.entity.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Rosemary
 * @title: OrderController
 * @projectName cloud2020
 * @date 2020/11/415:43
 */
@RestController
public class OrderController {

    //    public static final String PAYMENT_URL = "http://localhost:8001"; 单机版的
    //为了使用集群，将这部分路径改写，从eureka里面中获取
    public static final String INVOTE_URL = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/comsumer/payment/consul")
    public CommonResult<String> create() {
        //之前出错原因：我拜托你啊。好好复制行不行，明明返回的String你要杠CommonRestult无脑复制上瘾了咩
        String forObject = restTemplate.getForObject(INVOTE_URL + "/payment/payment/consul", String.class);
        return CommonResult.SUCCESS(forObject);
    }


}
