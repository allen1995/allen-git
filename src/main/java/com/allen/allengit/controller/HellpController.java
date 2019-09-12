package com.allen.allengit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: allen
 * @Date: 2019/9/11 23:56
 * @Description:
 */
@RestController
public class HellpController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello allen";
    }
}
