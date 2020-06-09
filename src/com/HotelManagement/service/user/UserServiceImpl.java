package com.HotelManagement.service.user;

import com.HotelManagement.dao.user.UserMapper;
import com.HotelManagement.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String userCode, String password) {

        User user = userMapper.getUserByUserCode(userCode);

        if(user!=null && !user.getUserPassword().equals(password)){
            user = null;
        }
        return user;
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
