package com.zwj.git_springboot_study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zengwenjie
 * @Date:2021/1/27 19:27
 */
@RestController
public class MyController {
    @GetMapping("/test")
    String index() {
        return "index";
    }
}
