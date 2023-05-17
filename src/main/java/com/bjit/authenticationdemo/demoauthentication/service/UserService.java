package com.bjit.authenticationdemo.demoauthentication.service;

import com.bjit.authenticationdemo.demoauthentication.model.UserRequestModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    ResponseEntity<Object> register(UserRequestModel userDTO);
    ResponseEntity<Object> getUser(Integer id);
}
