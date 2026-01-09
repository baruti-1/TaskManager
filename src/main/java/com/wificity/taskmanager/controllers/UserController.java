package com.wificity.taskmanager.controllers;

import com.wificity.taskmanager.models.User;
import com.wificity.taskmanager.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getUsers(){
       //List<User> users = new ArrayList<>();
       //users.add(new User(1, "John", "user1@mail.com", "1234"));

        return userRepository.findAll();
    }
}
