package com.zwj.git_springboot_study;

import com.alibaba.druid.pool.DruidDataSource;
import com.zwj.git_springboot_study.dao.StudentDao;
import com.zwj.git_springboot_study.model.Student;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.annotation.Resource;
import javax.sql.DataSource;
@MapperScan("com.zwj.git_springboot_study.dao")
@SpringBootApplication
public class GitSpringbootStudyApplication {
    @Bean(initMethod = "init", destroyMethod = "close")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return new DruidDataSource();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:/mapper/*Mapper.xml"));
        return sqlSessionFactoryBean.getObject();
    }



    public static void main(String[] args) {
        SpringApplication.run(GitSpringbootStudyApplication.class, args);
        System.out.println("这是branch1的修改");
        System.out.println("这是主分区的修改");
    }

}
