package com.example.Spring_Boot_JPA.repos;

import com.example.Spring_Boot_JPA.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long>{
    User findByUsername(String username);
}
