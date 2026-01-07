package com.sk.SpringSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sk.SpringSecurity.entity.Users;
import com.sk.SpringSecurity.service.UserService;

@RestController
public class MyController {
	
	@Autowired
	UserService userService;

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
	
	// it will authorize before the method execution 
	@PreAuthorize("hasRole('USER')") // only the user can have the access to this api not other user have the access 
	@GetMapping("/public/user")
	public String userHello() {
		return "Hello user";
	}
	
	@PreAuthorize("hasRole('ADMIN')") // it will pre-authenticate whether the matching role can have access
	@GetMapping("/admin")
	public String adminHello() {
		return "Hello admin";
	}
	
	@PostMapping("/public/register")
	public ResponseEntity<String> resisterUser(@RequestBody Users user){
		String responce = userService.registerUser(user);
		return ResponseEntity.ok(responce);
	}
}
