package com.zwj.git_springboot_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitSpringbootStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitSpringbootStudyApplication.class, args);
        System.out.println("这是branch1的修改");
        System.out.println("这是主分区的修改");
    }

}
