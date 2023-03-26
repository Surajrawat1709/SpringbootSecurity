package com.spring.security.controller;


import com.spring.security.entity.User;
import com.spring.security.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
  private UserServices repo;

    @GetMapping("")
    public List<User> getAllUsers(){
        return this.repo.getAllUsers();
    }

    @GetMapping("/{name}")
    public User getSIngleUser(@PathVariable("name") String name){
        return this.repo.getSingleUser(name);
    }

    @PostMapping("")
    public User addUser(@RequestBody User user){
        return this.repo.addUser(user);
    }

}
