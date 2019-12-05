package com.ljy.web;

import com.ljy.api.TestApi;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: com.ljy.web
 * @作者:
 * @创建时间: 2019-12-05 08:51
 * @描述:
 **/
@RestController
public class Test1Controller {

    @Autowired
    TestApi testApi;

    @RequestMapping("ceshi/{name}")
    @HystrixCommand(fallbackMethod = "TestFallBack")
    public String tests1(@PathVariable String name) {
    	return testApi.test01(name);
    }


    public String TestFallBack(String name) {
    	return "出错了";
    }
}
