package com.hlx.controller;

import org.springframework.web.bind.annotation.*;

import com.hlx.dao.UserDao;
import com.hlx.entity.User;
import com.hlx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/getA")

    public List<User> getA(){
        System.out.println(userService.getA());
        return userService.getA();
    }

//    @RequestMapping(value = "/getUser/{name}",method = RequestMethod.GET)
    @GetMapping("/findByName")
    public List<User> findByName(String name){

        System.out.println("你所查询的用户信息如下："+userService.findByName(name));
        return userService.findByName(name);

    }

}
