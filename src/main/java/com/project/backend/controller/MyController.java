package com.project.backend.controller;

import com.project.backend.entity.User;
import com.project.backend.service.UserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private UserService userService;

    @PostMapping("/submit")
    public String receiveData(@RequestBody MyData data) {

        User user = new User();
        user.setUser_id(data.getId());
        user.setPw(data.getPw());
        user.setC_pw(data.getC_pw());
        user.setUsername(data.getUsername());
        user.setName(data.getName());
        user.setEmail(data.getEmail());
        user.setBirth(data.getBirth());

        userService.saveUser(user);

        System.out.println("Received data: " + data.getName() + "," + data.getUsername());

        return "Data received successfully";
    }
}

@Getter
@Setter
class MyData {
    private String id;
    private String pw;
    private String c_pw;
    private String username;
    private String name;
    private String email;
    private Date birth;
}
