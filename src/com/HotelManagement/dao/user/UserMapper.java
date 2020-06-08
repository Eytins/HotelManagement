package com.HotelManagement.dao.user;

import com.HotelManagement.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    // 根据用户名获得用户（进行登陆）
    User getUserByUserCode(@Param("userCode") String userCode);
}
