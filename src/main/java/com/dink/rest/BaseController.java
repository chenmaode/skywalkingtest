package com.dink.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenmaode
 * @description:
 * @email chenmaode@mbcloud.com
 * @date 上午9:04 2018/2/27
 */
public class BaseController {

    @RequestMapping("/get/{id}")
    public String get(@PathVariable Object id) {
        return "get id:"+id;
    }
}
