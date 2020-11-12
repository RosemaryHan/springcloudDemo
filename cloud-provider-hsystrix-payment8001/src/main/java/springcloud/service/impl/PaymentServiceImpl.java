package springcloud.service.impl;

import com.demo.entity.Payment;
import org.springframework.stereotype.Service;
import springcloud.service.PaymentService;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author Rosemary
 * @title: PaymentServiceImpl
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/11/310:08
 */
@Service
public class PaymentServiceImpl implements PaymentService {


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
    public String paymenetInfo(Long id) {
        return "线程池："+Thread.currentThread().getName()+"  Info OK!,id:"+id;
    }

    @Override
    public String paymenetInfoOut(Long id) {
        try{
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+"  paymenetInfoOut OK!,id:"+id;
    }
}
