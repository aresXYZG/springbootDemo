package com.hlx;

import com.hlx.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserService userService;
    @Test
    public void test1(){
        System.out.println("test");
        System.out.println(userService.getUsers());
    }

//    @Configuration
//    public class WebConfig extends WebMvcConfigurerAdapter {
//        @Override
//        public void addResourceHandlers(ResourceHandlerRegistry registry) {
//            registry.addResourceHandler("/**").addResourceLocations("classpath:/");
//            super.addResourceHandlers(registry);
//        }
//    }

}
//单元测试