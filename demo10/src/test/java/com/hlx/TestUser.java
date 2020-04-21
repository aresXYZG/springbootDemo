package com.hlx;

import com.hlx.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUser {

    @Autowired
    private UserService userService;
    @Test
    public void test1(){
        System.out.println("test");
        System.out.println(userService.getUsers());
        System.out.println(userService.findByName("abc"));
    }

}
//单元测试