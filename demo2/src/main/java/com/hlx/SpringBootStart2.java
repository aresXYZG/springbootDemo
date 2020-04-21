package com.hlx;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

public class SpringBootStart2 {

    public static void main(String[] args) {



        ConfigurableApplicationContext context =

                SpringApplication.run(SpringBootStart2.class, args);

        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        List<Map<String, Object>> result =

                jdbcTemplate.queryForList("SELECT * FROM USER");

        System.out.println(result);



    }

}