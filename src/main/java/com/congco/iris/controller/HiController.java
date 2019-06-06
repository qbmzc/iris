package com.congco.iris.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author congco
 * @date 19-6-6 下午4:16
 */
@RestController
@RequestMapping
public class HiController {

    /**
     * 首页
     *
     * @return
     */
    @GetMapping
    public String home() {
        return "Hello World";
    }
}
