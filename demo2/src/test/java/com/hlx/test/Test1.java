package com.hlx.test;

import com.hlx.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {

    @Autowired
    private UserService userService;
    @Test
    public void test() {
        System.out.println(123);
//        System.out.println(userService.getUser());
//        System.out.println(123);
    }
}
