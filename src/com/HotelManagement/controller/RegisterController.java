package com.HotelManagement.controller;

import com.HotelManagement.pojo.User;
import com.HotelManagement.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register.html")
    public String register() {
        return "register";
    }

    @RequestMapping(value = "/doRegister.html")
    public String doRegister(@RequestParam(value = "userCode") String userCode,
                             @RequestParam(value = "userPassword") String password,
                             @RequestParam(value = "userName") String userName,
                             @RequestParam(value = "gender") String gender,
                             @RequestParam(value = "birthday") String birthday,
                             @RequestParam(value = "phone") String phone,
                             @RequestParam(value = "role") String role) {

        User user = new User();

        Date birthDate = null;
        try {
            birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
        } catch (Exception e) {
            e.printStackTrace();
        }

        user.setUserCode(userCode);
        user.setUserPassword(password);
        user.setUserName(userName);
        user.setGender(Integer.parseInt(gender));
        user.setBirthday(birthDate);
        user.setPhone(phone);
        user.setUserCode(role);

        user.setCreationDate(new Date());

        this.userService.addUser(user);

        return "login";
    }

    @RequestMapping(value = "/doRegister2")
    public String doRegister2(@RequestParam(value = "userCode",defaultValue = "xiaoxiao") String userCode,
                             @RequestParam(value = "userPassword",defaultValue = "1") String password,
                             @RequestParam(value = "userName",defaultValue = "1") String userName,
                             @RequestParam(value = "gender",defaultValue = "1") String gender,
                             @RequestParam(value = "birthday", defaultValue = "1999-09-09") String birthday,
                             @RequestParam(value = "phone",defaultValue = "1") String phone,
                             @RequestParam(value = "role",defaultValue = "1") String role) {

        User user = new User();

        Date birthDate = null;
        try {
            birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
        } catch (Exception e) {
            e.printStackTrace();
        }

        user.setUserCode(userCode);
        user.setUserPassword(password);
        user.setUserName(userName);
        user.setGender(Integer.parseInt(gender));
        user.setBirthday(birthDate);
        user.setPhone(phone);
        user.setUserCode(role);

        user.setCreationDate(new Date());

        this.userService.addUser(user);

        return "index";
    }
}
