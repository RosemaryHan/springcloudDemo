package com.demo.springcloud.api.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true) //就是同一个对象可以接着点属性比如new People.setId("1").setName("12")
public class People implements Serializable {
    private String id;
    private String name;
    private Integer age;
}
