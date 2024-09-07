package com.example.demo.registerUser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterUserRepository extends JpaRepository<RegisterUser, String> {
}
