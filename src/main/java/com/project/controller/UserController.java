package com.project.controller;

import com.project.dao.UserDao;
import com.project.dto.UserDto;
import com.project.model.User;
import com.project.services.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/auth")
public class UserController {
    private final UserServices userServices;

    @GetMapping("/user")
    public List<User> findAll() {
        return userServices.findAll();
    }


    @GetMapping(value = "/user/{id}", produces = "application/json")
    public UserDto getUserById(@PathVariable("id") int id) {
        UserDto userById = userServices.findById(id);
        return userById;
    }

    @DeleteMapping("/user/{id}")
    public void deleteUserById(@PathVariable int id) {
        userServices.delete(id);
    }

    @DeleteMapping("/user/all")
    public void deleteAllUsers() {
        userServices.deleteAll();
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userServices.save(user);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        return userServices.update(user);

    }
}
