package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    User getOne(Integer user_id);

    List<User> getList();

    void addUser(User user);

   void delOne(Integer userId);

    void updateOne(User user);
}
