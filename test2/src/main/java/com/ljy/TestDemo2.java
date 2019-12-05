package com.ljy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: com.ljy
 * @作者:
 * @创建时间: 2019-12-05 08:43
 * @描述:
 **/
@SpringBootApplication
@RestController
//@EnableCircuitBreaker
//@EnableHystrix
public class TestDemo2 {

    public static void main(String[] args){
        SpringApplication.run(TestDemo2.class,args);
    }

    @RequestMapping("test2")
    public String test2() {
        System.out.println("TestDemo2健康");
        return "test2-ok";
    }
}
