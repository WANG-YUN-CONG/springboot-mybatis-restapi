package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: demo
 * @description: UserServiceImpl
 * @author: wyc
 * @create: 2019-08-19 11:21
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getOne(Integer userId) {
        User user = userMapper.getOne(userId);
        return user;
    }

    @Override
    public List<User> getList() {
        List<User> userList = userMapper.getList();
        return userList;
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void delOne(Integer userId) {
        userMapper.delOne(userId);
    }

    @Override
    public void updateOne(User user) {
        userMapper.updateOne(user);
    }

}