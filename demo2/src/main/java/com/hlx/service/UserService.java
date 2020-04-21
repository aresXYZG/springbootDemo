package com.hlx.service;

import com.hlx.dao.UserDao;
import com.hlx.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("UserService")
public class UserService {
            @Resource
            private UserDao userDao;

            public List<User> getUser(){
                return userDao.getUser();
    }
}
