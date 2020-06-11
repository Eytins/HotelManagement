package com.HotelManagement.service.user;

import com.HotelManagement.pojo.User;

import javax.management.relation.Role;
import java.util.List;

public interface UserService {

    User login(String userCode, String password);

    int addUser(User user);

    int getUserRole(String userCode);

    //根据用户名和用户角色获得用户列表
    public List<User> getUserList(String userName, Integer userRole);


    //获得角色列表
    public  List<Role> getRoleList();
}
