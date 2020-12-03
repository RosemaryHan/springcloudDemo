package com.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author Rosemary
 * @title: ReciController
 * @projectName cloud2020
 * @description: 接收相关消息。 Sink是接收流程的类
 * @date 2020/12/315:27
 */
@Component
@EnableBinding(Sink.class)
public class ReciController {
    @Value("${server.port}")
    private String servicePort;

    @StreamListener(Sink.INPUT)
    @GetMapping("/input")
    public void input(Message<String> message){
        System.out.println(message.getPayload()+" 1111111111消费者2号11111 "+servicePort);
    }
}
