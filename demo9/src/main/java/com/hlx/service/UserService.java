package com.hlx.service;

import com.hlx.dao.UserDao;
import com.hlx.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    
    @Resource
    private UserDao userDao;



    public List<User> getUsers() {
        return userDao.getUsers();
    }


    public boolean deleteUser(String name){
        boolean flag = false;
        try {
            flag = true;
            userDao.deleteUser(name);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public boolean addUser(User user){
        boolean flag = false;
        try {
            flag = true;
            userDao.addUser(user);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    public boolean updateUser(User user){
        boolean flag = false;
        try {
            flag = true;
            userDao.updateUser(user);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public List<User> findByName(String name) {

        return userDao.findByName(name);
    }
}

