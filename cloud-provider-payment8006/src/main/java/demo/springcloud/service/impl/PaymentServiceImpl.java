package demo.springcloud.service.impl;

import com.demo.entity.Payment;
import demo.springcloud.dao.PaymentDao;
import demo.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Rosemary
 * @title: PaymentServiceImpl
 * @projectName cloud2020
 * @date 2020/11/310:08
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int save(Payment payment) {
        return paymentDao.save(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
