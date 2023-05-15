package com.atguigu.springcloud.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Log4j2
public class ConsulOrderController {


    //consul-provider-payment   提供者集群的名字
    private static final String PAYMENT_URL = "http://consul-provider-payment";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String paymentInfo(){
        //找到提供者的集群，再到其中找符合这个路径的    /payment/consul
        String result = restTemplate.getForObject(PAYMENT_URL + "/payment/consul",String.class);
        System.out.println("消费者调用提供者： " + result);

        return result;
    }
}
