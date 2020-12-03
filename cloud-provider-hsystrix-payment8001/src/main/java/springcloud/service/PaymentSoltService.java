package springcloud.service;


import com.demo.entity.Payment;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Rosemary
 * @title: PaymentService
 * @projectName cloud2020
 * @description: 服务熔断
 * @date 2020/11/310:07
 */
public interface PaymentSoltService {

    /**
     * 　　* @description: 储存
     * 　　* @params
     * 　　* @return
     * 　　* @throws
     * 　　* @author Rosemary
     * 　　* @date 2020/11/3 10:07
     */

    int save(Payment payment);

    /**
     * 　　* @description: 根据ID查找
     * 　　* @params
     * 　　* @return
     * 　　* @throws
     * 　　* @author Rosemary
     * 　　* @date 2020/11/3 10:07
     */
    Payment getPaymentById(Long id);

    String paymenetInfo(Long id);

    String paymenetInfoOut(Long id);

    //服务器熔断
    public String paymentCutBack(Integer id);

}
