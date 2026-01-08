package com.wificity.taskmanager.controllers;

import com.wificity.taskmanager.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User(1, "John", "user1@mail.com", "1234"));
        users.add(new User(2, "Jane", "user2@mail.com", "1234"));
        users.add(new User(3, "Mary", "user3@mail.com", "1234"));
        return users;
    }
}
