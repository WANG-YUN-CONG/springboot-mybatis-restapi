package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    User getOne(@Param("userId") Integer userId);

    List<User> getList();

    void addUser(User user);

    void delOne(@Param("userId") Integer userId);

    void updateOne(User user);
}
