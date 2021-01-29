package com.zwj.git_springboot_study.controller;

import com.zwj.git_springboot_study.dao.StudentDao;
import com.zwj.git_springboot_study.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author:zengwenjie
 * @Date:2021/1/27 19:27
 */
@RestController
public class MyController {
    @Resource
    StudentDao studentDao;
    @GetMapping("/test")
    String index() {
        Student student = studentDao.getStudentById(1);
        System.out.println(student);
        return "index";
    }
}
