package com.headstrait.user.controller;

import com.headstrait.user.entity.User;
import com.headstrait.user.service.UserService;
import com.headstrait.user.valueobject.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("inside saveUser method of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartmentById(@PathVariable Long id){
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(id);
    }

}
