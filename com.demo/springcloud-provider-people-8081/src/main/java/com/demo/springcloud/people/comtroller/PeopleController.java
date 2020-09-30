package com.demo.springcloud.people.comtroller;

import com.demo.springcloud.api.domain.People;
import com.demo.springcloud.people.serice.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @author: Rosemary
 * @date: 2020/9/30 1:19
 * @description:
 */
@RestController
@RequestMapping("/people")
public class PeopleController {
    @Autowired
    private PeopleService peopleService;

    @PostMapping("/add")
    @ResponseBody
    public boolean add(People people) {
        if (peopleService.addPeople(people) > 0) {
            return true;
        } else
            return false;
    }

    @GetMapping("/getById/{id}")
    @ResponseBody
    public People getById(@PathVariable("id") String id) {
        if (id == null || id == "") {
            return null;
        }
        return peopleService.getById(id);
    }

    @PostMapping("/list")
    @ResponseBody
    public List<People> list() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        return peopleService.list(map);
    }
}
