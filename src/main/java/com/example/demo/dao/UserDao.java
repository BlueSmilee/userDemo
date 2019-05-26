package com.example.demo.dao;

import com.example.demo.model.PO.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserDao {
    @Insert("insert into user(username, password,createTime,updateTime,createUserId,updateUserId,deleteFlag) values(#{username}, #{password},#{createTime},#{updateTime},#{createUserId},#{updateUserId},#{deleteFlag})")
    void addUser(User user);

    @Select("select * from user where username = #{username}")
    User getUserByUserName (String username);

    @Delete("delete from user where username = #{username}")
    int deleteByUserName (String username);

    @Update("update user set   password= #{password} where username= #{username}")
   void updateByUserName(User user);
}
