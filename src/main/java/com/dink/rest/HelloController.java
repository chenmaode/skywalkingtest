package com.dink.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenmaode
 * @description:
 * @email chenmaode@mbcloud.com
 * @date 上午8:57 2018/2/27
 */
@RestController
public class HelloController extends BaseController{

    @RequestMapping("/hello/{id}")
    public String hello(@PathVariable Object id) {
        return "hello,skywalking id:"+id;
    }
}
