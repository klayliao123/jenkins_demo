package com.springboot.shizhan.ch03.demo01.controller;

import com.springboot.shizhan.ch03.demo01.entity.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @RequestMapping("/person")
    public Person getPerson(){
        Person p = new Person();
        p.setId(1);
        p.setName("Jack");
        return p;
    }

}
