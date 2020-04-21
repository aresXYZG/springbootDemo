package com.weather;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * @author hulingxiao
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class Start {
    public static void main(String[] args){


        SpringApplication.run(Start.class, args);
    }

}
