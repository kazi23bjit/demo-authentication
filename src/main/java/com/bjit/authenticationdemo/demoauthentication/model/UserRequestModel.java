package com.bjit.authenticationdemo.demoauthentication.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequestModel {
    private String userName;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
}
