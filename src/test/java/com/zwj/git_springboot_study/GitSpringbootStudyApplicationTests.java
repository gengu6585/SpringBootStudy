package com.zwj.git_springboot_study;

import com.zwj.git_springboot_study.dao.StudentDao;
import com.zwj.git_springboot_study.model.Student;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GitSpringbootStudyApplicationTests {
    @Resource
    SqlSessionFactory sessionFactory;

    @Test
    void contextLoads() {
        System.out.println("测试修改");
    }
    @Test
    public void test() {
        System.out.println(com.zwj.git_springboot_study.util.JDBCUtil.getConn());;
    }

    @Test
    public void test1() {


    }


}
