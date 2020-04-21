package com.hlx.dao;

import com.hlx.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    public List<User> getUser();
}
