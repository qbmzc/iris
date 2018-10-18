package com.congco.iris.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created on 2018/10/18 12:34
 *
 * @author qbmzc
 */
@RestController
@RequestMapping("test")
public class TestController {
    /**
     * @return
     */
    @GetMapping("index")
    public String index() {
        return "hello world";
    }
}
