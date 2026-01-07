package com.sk.SpringSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.SpringSecurity.entity.Users;

public interface UserRepository extends JpaRepository<Users, String> {
    boolean existsByUsername(String username);
}
