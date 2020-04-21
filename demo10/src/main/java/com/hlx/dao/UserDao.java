package com.hlx.dao;

import com.hlx.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select * from  a_user")
    List<User> getUsers();

//    @Select("select * from  a_user where name ='abc'")
    @Select("SELECT name,password FROM a_user where name=#{name}")
    List<User> findByName(@Param("name")String name);
    List<User> getUser(String name);
    List<User> getA();
}
