package com.hlx.dao;

import com.hlx.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select * from  t_user")
    List<User> getUsers();

    //    @Select("select * from  a_user where name ='abc'")
    @Select("SELECT * FROM t_user where name=#{name}")
    List<User> findByName(@Param("name")String name);

    @Update("update t_user set name=#{name},password=#{password} where name=#{name}")
    void updateUser(User user);

    @Delete("delete from t_user where name=#{name}")
    void deleteUser(@Param("name")String name);

    @Insert("insert into t_user(name,password) values (#{name},#{password})")
    void addUser(User user);

}
