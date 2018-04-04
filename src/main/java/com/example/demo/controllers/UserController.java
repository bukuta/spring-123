package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dao.User;
import com.example.demo.responses.Pagable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/users")
@RestController
public class UserController {

    @RequestMapping("")
    public List<User> fetch(){
        List<User> users = new ArrayList<>();
        User u = new User();
        u.id=123;
        u.name="name";
        users.add(u);
        return users;
    }

    @RequestMapping("/online") 
    public Pagable<User> online(){
        Pagable<User> rs = new Pagable<User>();
        rs.total=100;
        rs.items=new ArrayList<User>(); 
        for(int i=0;i<10;i++){
            User u = new User();
            u.id=i;
            u.name="name"+i;
            rs.items.add(u);
        }
        return rs;
    }
    @RequestMapping("/ooo")
    public Page<User> ooo(){
        List<User> items = new ArrayList<User>();
        User  u = new User();
        u.id=123;
        u.name="name123";
        items.add(u);
        Page<User> rs = new PageImpl<User>(items);
        return rs;
    }

    @RequestMapping("/{userId}")
    public User fetchOne(@PathVariable Integer userId){
        User u = new User();
        u.id=userId;
        u.name="name"+userId;
        return u;
    }

}