package com.zwj.git_springboot_study.mybatis_study;

import com.zwj.git_springboot_study.dao.StudentDao;
import com.zwj.git_springboot_study.model.Book;
import com.zwj.git_springboot_study.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

/**
 * @Author:zengwenjie
 * @Date:2021/1/29 16:08
 */
public class Mybatistest {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        // 读取配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 构建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            // 操作CRUD，第一个参数：指定statement，规则：命名空间+“.”+statementId
            // 第二个参数：指定传入sql的参数：这里是用户id
//            Student student = sqlSession.selectOne("com.zwj.git_springboot_study.dao.StudentDao.getStudentById", 1);
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);

            Student student1 = mapper.getStudentByIdSteps(1);
            System.out.println(student1.getBooks());
//            HashMap<Integer, Book> books= mapper.getAllBooksToMap();
//            System.out.println(books);


        } finally {
            sqlSession.close();
        }
    }
}
