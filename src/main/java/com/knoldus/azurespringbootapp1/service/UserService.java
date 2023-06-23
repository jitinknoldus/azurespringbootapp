package com.knoldus.azurespringbootapp1.service;

import com.knoldus.azurespringbootapp1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    List<User> users = new ArrayList<>();

    public String addUser(User myUser){
        users.add(myUser);
        return "user add successfully";
    }

    public Optional<List<User>> getUsers(){
        return Optional.ofNullable(users);
    }

    public String getUserNameById(Long id){
        for (User user : users) {
            if (user.getId() == id) {
                return user.getName();
            }
        }
        return "Student not found";
    }

}
