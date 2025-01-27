package com.jwtProject.Backend.Assesment.Project.controller;

import com.jwtProject.Backend.Assesment.Project.Model.User;
import com.jwtProject.Backend.Assesment.Project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    UserService userService;


    // http://localhost:8080/home/users
    @GetMapping("/users")
    public List<User> getUser(){
        System.out.println("getting users name");
        return this.userService.getUsers();
    }
}
