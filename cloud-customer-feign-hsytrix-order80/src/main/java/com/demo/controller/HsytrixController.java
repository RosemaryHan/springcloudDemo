package com.demo.controller;

import com.demo.service.HsytrixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Rosemary
 * @title: HsytrixController
 * @projectName cloud2020
 * @description: 负载均衡演示
 * @date 2020/11/1817:29
 */
@RestController
public class HsytrixController {
    @Resource
    private HsytrixService hystrixService;

    @GetMapping("/hsytrix/paymenetInfo/{id}")
    public String paymenetInfo(@PathVariable("id") Long id) {

        return hystrixService.paymenetInfo(id);
    }

    @GetMapping("/hsytrix/paymenetInfoOut/{id}")
    public String paymenetInfoOut(@PathVariable("id") Long id) {
        return hystrixService.paymenetInfoOut(id);
    }
}
