package com.ljy.api;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @类名: com.ljy.api
 * @作者:
 * @创建时间: 2019-12-05 08:45
 * @描述:
 **/
@FeignClient(name = "ribbon02")
public interface TestApi {

  @RequestMapping("test01")
    public String test01(@RequestParam String name);
}
