package com.cdut.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xieqiang-daye on 2019-04-23.
 */
@RestController
@RequestMapping("/api")
public class Index {

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        System.out.println("系统，你好！");
        return "hello "+name+"，this is first messge";
    }
}
