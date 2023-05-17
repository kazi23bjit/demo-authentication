package com.bjit.authenticationdemo.demoauthentication.repository;

import com.bjit.authenticationdemo.demoauthentication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
