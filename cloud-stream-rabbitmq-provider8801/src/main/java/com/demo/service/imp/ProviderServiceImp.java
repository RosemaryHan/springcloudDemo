package com.demo.service.imp;

import com.demo.service.ProviderService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author Rosemary
 * @title: ProviderService
 * @projectName cloud2020
 * @description: 这一块主要开始做中间件的消息发送。@{@link EnableBinding}的使用就是因为这个架包的设计原理
 * 流程：先是通过Source进到MessageChannel管道铺设好以后再进行操作，构建
 * @date 2020/12/311:29
 */
@EnableBinding(Source.class)//定义消息的配送管道
@Service
public class ProviderServiceImp implements ProviderService {
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String message = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(message).build());
        System.out.println(message);
        return null;
    }
}
