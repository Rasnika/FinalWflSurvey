package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.UserResponseEntity;

public interface UserResponseRepo extends JpaRepository<UserResponseEntity, Long> {

}