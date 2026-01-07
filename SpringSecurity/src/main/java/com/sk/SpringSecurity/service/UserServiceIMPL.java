package com.sk.SpringSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sk.SpringSecurity.entity.Users;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    private UserDetailsManager userDetailsManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String registerUser(Users user) {

        // Check if user already exists
        if (userDetailsManager.userExists(user.getUsername())) {
            return "User already exists!";
        }

        // Build Spring Security user
        UserDetails userDetails = User.withUsername(user.getUsername())
                .password(passwordEncoder.encode(user.getPassword()))
                .roles(user.getRole()) // USER / ADMIN
                .build();

        // Saves into users + authorities tables
        userDetailsManager.createUser(userDetails);

        return "User registered successfully!";
    }
}
