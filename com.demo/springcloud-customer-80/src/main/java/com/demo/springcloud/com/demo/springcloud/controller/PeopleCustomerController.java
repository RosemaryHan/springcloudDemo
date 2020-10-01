package com.demo.springcloud.com.demo.springcloud.controller;

import com.demo.springcloud.api.domain.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

/**
 * @author: Rosemary
 * @date: 2020/9/30 17:19
 * @description: 消费者是不需要service层的，于是就出现了restFul风格像下面这样
 */
@RestController
@RequestMapping("/customer/peopel")
public class PeopleCustomerController {
    @Autowired
    private RestTemplate restTemplate;//简单模板。负责调用http的各种方法

    private static final String REST_URL_PREFIX = "http://localhost:8001/provider/people";

    @RequestMapping("/getById/{id}")
    public People getById(@PathVariable("id") String id) {
        if (StringUtils.isEmpty(id)) {
            return null;
        }
        //get请求
        String s = REST_URL_PREFIX + "/getById/" + id;
        People forObject = restTemplate.getForObject(s, People.class);
        return forObject;
    }

    @RequestMapping("/save")
    @ResponseBody
    public People save(@RequestBody People people) {
        if (people == null) {
            return null;
        }
        //post请求
        return restTemplate.postForObject(REST_URL_PREFIX + "/save", people, People.class);
    }

    @RequestMapping("/list")
    @ResponseBody
    public People list() {
        //post请求
        return restTemplate.getForObject(REST_URL_PREFIX + "/provider/people/list", People.class);
    }
}
