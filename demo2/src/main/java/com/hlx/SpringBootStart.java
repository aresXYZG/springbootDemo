package com.hlx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan(basePackages="com.hxl.dao")
//通过禁用指定的自动化配置来避免加载不必要的自动化配置
//@SpringBootApplication
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringBootStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStart.class, args);
    }
}
