package com.zwj.git_springboot_study.dao;

import com.zwj.git_springboot_study.model.Book;
import com.zwj.git_springboot_study.model.Student;
import org.apache.ibatis.annotations.MapKey;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * @Author:zengwenjie
 * @Date:2021/1/28 13:06
 */
@Component
public interface StudentDao {
    public Student getStudentById(int id);
    public Student getStudentByIdSteps(int id);

    public List<Book> getAllBooks();
    @MapKey("id")
    public HashMap<Integer, Book> getAllBooksToMap();
}


