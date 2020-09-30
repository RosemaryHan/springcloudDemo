package com.demo.springcloud.people.serice.impl;

import com.demo.springcloud.api.domain.People;
import com.demo.springcloud.people.dao.PeopleDao;
import com.demo.springcloud.people.serice.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: Rosemary
 * @date: 2020/9/30 1:17
 * @description:
 ***/
@Service
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    private PeopleDao peopleDao;

    public int addPeople(People people) {
        return peopleDao.addPeople(people);
    }

    public People getById(String id) {
        return peopleDao.getById(id);
    }

    public List<People> list(Map<String, Object> map) {
        return peopleDao.list(map);
    }
}
