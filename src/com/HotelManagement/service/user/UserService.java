package com.HotelManagement.service.user;

import com.HotelManagement.pojo.User;

public interface UserService {

    public User login(String userCode, String password);
}
