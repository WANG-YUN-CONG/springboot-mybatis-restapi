package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: demo
 * @description: UserController
 * @author: wyc
 * @create: 2019-08-19 11:17
 */

@Controller
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;


    // RestfulApi  demo

    /**
     * GET http://localhost:8080/api/user
     * 获取所有
     * @return
     */
    @GetMapping("/user")
    @ResponseBody
    public List<User> getList(){
       return userService.getList();
    }


    /**
     * GET http://localhost:8080/api/user/2
     * 获取单个
     * @param userId
     * @return
     */
    @GetMapping("/user/{userId}")
    @ResponseBody
    public User getOne(@PathVariable Integer userId){
        return userService.getOne(userId);
    }

    /**
     *  POST http://localhost:8080/api/user
     *  新增
     *  @RequestBody   前台必须发送post请求，发送的是JSon格式的数据,能把json转成对象
     *    Body   raw    test改成json数据
     *  {
     * "userName": "123",
     * "passWord": "99999",
     * "realName": "123131"
     * }
     */
    @PostMapping("/user")
    @ResponseBody
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    /**
     * DELETE http://localhost:8080/api/user/1
     * @param userId
     */
    @DeleteMapping("/user/{userId}")
    @ResponseBody
    public void delOne(@PathVariable Integer userId){
        userService.delOne(userId);
    }

    /**
     * PUT http://localhost:8080/api/user
     *  更post请求方式一样
     * @param user
     */
    @PutMapping("/user")
    @ResponseBody
    public void updateOne(@RequestBody User user){
        userService.updateOne(user);
    }



    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}