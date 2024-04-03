package com.jwtProject.Backend.Assesment.Project.service;

import com.jwtProject.Backend.Assesment.Project.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> list = new ArrayList<>();

    public  UserService(){
        list.add(new User(UUID.randomUUID().toString(),"Radha","radha@123"));
        list.add(new User(UUID.randomUUID().toString(),"Riyansh","riyansh@123"));
        list.add(new User(UUID.randomUUID().toString(),"rishi","rishi@123"));
        list.add(new User(UUID.randomUUID().toString(),"shiv","shiv@123"));

    }

    public List<User> getUsers(){
        return this.list;
    }
}
