package springcloud.service.impl;

import com.demo.entity.Payment;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import springcloud.service.PaymentService;
import springcloud.service.PaymentSoltService;

import java.util.concurrent.TimeUnit;

/**
 * @author Rosemary
 * @title: PaymentServiceImpl
 * @projectName cloud2020
 * @date 2020/11/310:08
 */
@Service
@DefaultProperties(defaultFallback = "fallBack")
public class PaymentServiceSoltImpl implements PaymentSoltService {


    @Override
    public int save(Payment payment) {
        return 0;
//        return paymentDao.save(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return null;
//                paymentDao.getPaymentById(id);
    }

    @Override
    @HystrixCommand
    public String paymenetInfo(Long id) {
        return "线程池：" + Thread.currentThread().getName() + "  Info OK!,id:" + id;
    }

    @Override
    @HystrixCommand
    public String paymenetInfoOut(Long id) {
        int time = 5;
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "  paymenetInfoOut OK!,id:" + id;
    }

    @Override
    public String paymentCutBack(Integer id) {
        return "啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊";
    }

    //全局方法
    public String fallBack() {
        return "回调方法";
    }
}
