package com.hlx.service;

import com.hlx.dao.UserDao;
import com.hlx.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Autowired
    @Resource
    private UserDao userDao;


    public List<User> getA() {
    return userDao.getA();
}
    public List<User> getUsers() {
        return userDao.getUsers();
    }
    public List<User> getUser(String name) {
        return userDao.getUser(name);
    }
    public List<User> findByName(String name) {
        return userDao.findByName(name);
    }

}

