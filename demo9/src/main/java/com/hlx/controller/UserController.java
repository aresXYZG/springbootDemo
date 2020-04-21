package com.hlx.controller;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hlx.dao.UserDao;
import com.hlx.entity.User;
import com.hlx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class UserController {

    @Autowired
    private UserService userService;
//    @RequestMapping("/test")
//    public void test(){
//        int a =123;
//        System.out.println(a);
//    }


    @RequestMapping(value = "/getUsers" )
    public List<User> getUsers() {

        List<String> list = new ArrayList<>();
        return userService.getUsers();
    }


    @GetMapping("/getName")
    public void getByName(){
        System.out.println("sss");

    }
    @GetMapping("/findByName")
    public User findByName(User user){

        System.out.println("你所查询的用户信息如下："+userService.findByName(user.getName()));
//        ResponseEntity<User> userResponseEntity = new RestTemplate.getForEntity("http://USER-SERVICE/getUserData?username=" + username, User.class);
        return userService.findByName(user.getName()).get(0);

    }
    @PostMapping("/findByName")
    public List<User> findName1(){
        new RestTemplate().postForEntity(, , , )
        ResponseEntity<User> user = new RestTemplate().getForEntity("http://localhost:8089/rest/findByName?name=asd", User .class);
        System.out.println(user.getBody());
        return null;
    }
//    @PostMapping("/findByName")
//    public List<User> findByName(String name){
//
////           System.out.println("你所查询的用户信息如下："+userService.findByName(name));
//         return userService.findByName("name");
//
//    }
    @DeleteMapping("/deleteUser")
    public boolean deleteUser(String name){

//        System.out.println("用户："+name+"已删除");
        return userService.deleteUser(name);
    }

    @PostMapping("/addUser")
    public boolean addUser(User user){

        return userService.addUser(user);
    }

    @PostMapping("/updateUser")
    public boolean updateUser(User user){

        return userService.updateUser(user);
    }
}
