package com.example.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**

/**
 * @Description: java类作用描述
 * @Author: denggc3
 * @CreateDate: 2019/12/2$ 10:31$
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/12/2$ 10:31$
 * @UpdateRemark: 更新内容
 * @Version: 1.0
 */


@RestController
@RequestMapping(value = "demo", method = RequestMethod.POST)
public class TestController {

    @RequestMapping(value = "test1", method = RequestMethod.POST)
    public String test1(){
        return "test1 success";
    }


    @RequestMapping(value = "test2", method = RequestMethod.POST)
    public String test2(String name){
        return name+"test2 success";
    }

    @RequestMapping(value = "test3", method = RequestMethod.GET)
    public String test3(String name){
        return name+"test3 success";
    }
}

