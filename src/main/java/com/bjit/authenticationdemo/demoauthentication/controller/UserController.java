package com.bjit.authenticationdemo.demoauthentication.controller;

import com.bjit.authenticationdemo.demoauthentication.model.UserRequestModel;
import com.bjit.authenticationdemo.demoauthentication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public ResponseEntity<Object> registerUser(@RequestBody UserRequestModel userRequestModel){
        return userService.register(userRequestModel);
    }

    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<Object> getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }
}
