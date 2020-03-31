package com.springbootcamp.springsecurity.dao;

import com.springbootcamp.springsecurity.entities.AppUser;
import com.springbootcamp.springsecurity.GrantAuthorityImpl;
import com.springbootcamp.springsecurity.entities.User;
import com.springbootcamp.springsecurity.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class UserDao {

    @Autowired
    UserRepository userRepository;

    public AppUser loadUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        System.out.println(user);
        if (username != null) {
            return new AppUser(user.getUsername(), user.getPassword(), Arrays.asList(new GrantAuthorityImpl(user.getRole())));
        } else {
            throw new RuntimeException();
        }

    }
}
