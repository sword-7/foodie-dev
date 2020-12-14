package com.mall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : fjf
 * @class
 * @date : 2020-12-14 22:14
 **/
@RestController
@RequestMapping(value = "/foodie")
public class ControllerTest {

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }


}
