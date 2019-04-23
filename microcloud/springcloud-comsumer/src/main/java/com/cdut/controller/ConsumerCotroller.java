package com.cdut.controller;

import com.cdut.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xieqiang-daye on 2019-04-23.
 */
@RestController
@RequestMapping("/consum")
public class ConsumerCotroller {
    @Autowired
    HelloRemote helloRemote;
    @RequestMapping("/index/{name}")
    public String index(@PathVariable("name")String name){
        System.out.println("开启远程调用接口！");
        return helloRemote.index(name);
    }
}
