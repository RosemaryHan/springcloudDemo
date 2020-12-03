package com.demo.controller;

import com.demo.service.ProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Rosemary
 * @title: SendMessageController
 * @projectName cloud2020
 * @description: stream生产者演示
 * @date 2020/12/311:44
 */
@RestController
public class SendMessageController {
    @Resource
    private ProviderService messProvider;

    @GetMapping("/sendMessage")
    public String sendMessage() {
        return messProvider.send();
    }

}
