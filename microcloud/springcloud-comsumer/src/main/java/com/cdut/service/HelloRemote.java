package com.cdut.service;

import org.apache.commons.lang.ObjectUtils;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xieqiang-daye on 2019-04-23.
 */
@FeignClient(name= "spring-cloud-producer")
public interface HelloRemote {
    @RequestMapping("/api/hello")
    String index(@RequestParam(value = "name")String name );
}
