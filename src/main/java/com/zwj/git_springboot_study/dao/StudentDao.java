package com.zwj.git_springboot_study.dao;

import com.zwj.git_springboot_study.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author:zengwenjie
 * @Date:2021/1/28 13:06
 */
@Component
public interface StudentDao {
    public Student getById(int id);
}
