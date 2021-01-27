package com.zwj.git_springboot_study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitSpringbootStudyApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("测试修改");
    }
    @Test
    public void test() {
        System.out.println(com.zwj.git_springboot_study.util.JDBCUtil.getConn());;
    }

}
