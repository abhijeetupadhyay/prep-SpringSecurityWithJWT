package com.example.SpringSecurityWithJWT.repository;

import com.example.SpringSecurityWithJWT.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
