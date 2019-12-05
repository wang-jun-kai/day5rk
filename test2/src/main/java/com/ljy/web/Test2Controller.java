package com.ljy.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: com.ljy.web
 * @作者:
 * @创建时间: 2019-12-05 08:54
 * @描述:
 **/
@RestController
public class Test2Controller {

    @RequestMapping("test01")
    public String tests01(String name) {
    	System.out.println("-------"+name);
    	return "tests01--ok";
    }
}
