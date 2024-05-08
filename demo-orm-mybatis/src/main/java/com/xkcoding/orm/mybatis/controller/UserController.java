package com.xkcoding.orm.mybatis.controller;

import cn.hutool.core.lang.Dict;
import com.xkcoding.orm.mybatis.entity.User;
import com.xkcoding.orm.mybatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * User Controller
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-10-15 13:58
 */
@RestController
@Slf4j
public class UserController {
    //Mapper是可以自动注入的
    private final UserMapper userService;

    @Autowired
    public UserController(UserMapper userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public Dict save(@RequestBody User user) {
        int save = userService.saveUser(user);
        return Dict.create().set("code", save == 1 ? 200 : 500).set("msg", save == 1 ? "成功" : "失败").set("data", save == 1 ? user : null);
    }

    @DeleteMapping("/user/{id}")
    public Dict delete(@PathVariable Long id) {
        int delete = userService.deleteById(id);
        return Dict.create().set("code", delete== 1  ? 200 : 500).set("msg", delete== 1  ? "成功" : "失败");
    }

   /* @PutMapping("/user/{id}")
    public Dict update(@RequestBody User user, @PathVariable Long id) {
        Boolean update = userService.update(user, id);
        return Dict.create().set("code", update ? 200 : 500).set("msg", update ? "成功" : "失败").set("data", update ? user : null);
    }*/

    @GetMapping("/user/{id}")
    public Dict getUser(@PathVariable Long id) {
        User user = userService.selectUserById(id);
        return Dict.create().set("code", 200).set("msg", "成功").set("data", user);
    }

    @GetMapping("/user")
    public Dict getUser() {
        List<User> userList = userService.selectAllUser();
        return Dict.create().set("code", 200).set("msg", "成功").set("data", userList);
    }
}
