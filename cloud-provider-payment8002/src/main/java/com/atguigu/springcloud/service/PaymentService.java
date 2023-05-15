package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    //写入
    public int create(Payment payment);
    //查询
    public Payment getPaymentById(@Param("id") Long id);
}
