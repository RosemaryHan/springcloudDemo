package com.demo.springcloud.service;


import com.demo.entity.Payment;

/**
 * @author Rosemary
 * @title: PaymentService
 * @projectName cloud2020
 * @date 2020/11/310:07
 */
public interface PaymentService {

    /**
     * 　　* @description: 储存
     * 　　* @params
     * 　　* @return
     * 　　* @throws
     * 　　* @author Rosemary
     * 　　* @date 2020/11/3 10:07
     *
     */

    int save(Payment payment);

    /**
     * 　　* @description: 根据ID查找
     * 　　* @params
     * 　　* @return
     * 　　* @throws
     * 　　* @author Rosemary
     * 　　* @date 2020/11/3 10:07
     *
     */
    Payment getPaymentById(Long id);
}
