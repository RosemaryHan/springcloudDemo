package com.demo.springcloud.people.serice;

import com.demo.springcloud.api.domain.People;

import java.util.List;
import java.util.Map;

public interface PeopleService {
    /**
     * 添加
     */
    int addPeople(People people);

    /**
     * 根据ID查找
     */
    People getById(String id);

    /**
     * @Description：列表查询
     * @param: map
     * @return: List<People>
     * @auther: Rosemary
     * @date: 2020/9/30 1:04
     */
    List<People> list(Map<String, Object> map);

}
