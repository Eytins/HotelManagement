package com.HotelManagement.pojo;


import java.util.Date;

public class User {

    private long id;
    private String userCode;
    private String userName;
    private String userPassword;
    private long gender;
    private Date birthday;
    private String phone;
    private long userRole;
    private Date creationDate;
    private java.sql.Timestamp modifyDate;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    public long getGender() {
        return gender;
    }

    public void setGender(long gender) {
        this.gender = gender;
    }


    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public long getUserRole() {
        return userRole;
    }

    public void setUserRole(long userRole) {
        this.userRole = userRole;
    }


    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


    public java.sql.Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(java.sql.Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

}
