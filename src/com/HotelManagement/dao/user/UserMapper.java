package com.HotelManagement.dao.user;

import com.HotelManagement.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface UserMapper {

    // 根据用户名获得用户（进行登陆）
    User getUserByUserCode(@Param("userCode") String userCode);

    //注册用户
    public int addUser(@Param("userCode")String userCode,
                       @Param("userName")String userName,
                       @Param("userPassword") String userPassword,
                       @Param("gender")int gender,
                       @Param("birthday")Date birthday,
                       @Param("phone") String phone,
                       @Param("userRole") int userRole
                       );



}
