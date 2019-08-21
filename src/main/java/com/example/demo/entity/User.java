package com.example.demo.entity;

/**
 * @program: demo
 * @description: User
 * @author: wyc
 * @create: 2019-08-19 11:19
 */
public class User {
    private Integer userId;
    private String userName;
    private String passWord;
    private String realName;

    public User(Integer userId, String userName, String passWord, String realName) {
        this.userId = userId;
        this.userName = userName;
        this.passWord = passWord;
        this.realName = realName;
    }

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}