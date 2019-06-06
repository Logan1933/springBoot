package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:一个简单的springBoot工程
 * @Author:guofeng
 * @Date: 2019/6/6
 */
@RestController
public class DemoController {

    @RequestMapping(value = "/getStr", method = RequestMethod.GET)
    public String getStr(){
        System.out.println("test springBoot!");
        return "Hello World!";
    }
}
