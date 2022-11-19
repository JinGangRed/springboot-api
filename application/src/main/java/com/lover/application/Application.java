package com.lover.application;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;

/**
 * @Description: 项目启动
 * @Author: Keen
 * @Date: 2022/11/8
 * @Version: 1.0
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.lover")
@MapperScan(basePackages = "com.lover.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
