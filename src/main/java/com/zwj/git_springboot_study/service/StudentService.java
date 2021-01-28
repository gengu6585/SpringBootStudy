package com.zwj.git_springboot_study.service;

import com.zwj.git_springboot_study.dao.StudentDao;

import javax.annotation.Resource;

/**
 * @Author:zengwenjie
 * @Date:2021/1/28 13:09
 */
public class StudentService {
    @Resource
    StudentDao studentDao;

}
