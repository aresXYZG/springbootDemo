package com.hlx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.hlx.dao")
public class SpringBootStart {
    public static void main(String[] args) {


        SpringApplication.run(SpringBootStart.class, args);
        args:{

        }
    }
}
