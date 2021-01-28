package com.zwj.git_springboot_study.controller;

import com.zwj.git_springboot_study.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zengwenjie
 * @Date:2021/1/27 21:39
 */
@RestController("/student")
public class Controller_test {

    @GetMapping("/test1")
    String fangfa() {

//        Student zengwenting = new Student("曾文婷");
//        Student.Book book = new Student.Book("小王子");
//        zengwenting.setBook(book);
        return "zengwenting";
    }
}
