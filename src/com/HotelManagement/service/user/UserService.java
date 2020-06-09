package com.HotelManagement.service.user;

import com.HotelManagement.pojo.User;

public interface UserService {

    User login(String userCode, String password);

    int addUser(User user);
}
