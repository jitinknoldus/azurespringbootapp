package com.knoldus.azurespringbootapp1.controller;

import com.knoldus.azurespringbootapp1.model.User;
import com.knoldus.azurespringbootapp1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/api/displayUsers")
    public Optional<List<User>> displayUsers(){
        return userService.getUsers();
    }

    @PostMapping("/api/adduser")
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "user added successfully";
    }


    @GetMapping("/api/findUser/{id}")
    public String findUserById(@PathVariable Long id){
        return userService.getUserNameById(id);
    }


}
