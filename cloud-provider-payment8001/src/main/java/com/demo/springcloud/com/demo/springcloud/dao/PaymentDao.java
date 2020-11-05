package com.demo.springcloud.com.demo.springcloud.dao;

import com.demo.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Rosemary
 * @title: PaymentDao
 * @projectName cloud2020
 * @description: paymentDao层
 * @date 2020/11/39:43
 */
@Mapper
public interface PaymentDao {
    int save(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}
