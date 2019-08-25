package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.UserEntity;


public interface UserEntityRepo extends JpaRepository<UserEntity, Integer> {

	@Query(value="select * from User_Entity u where u.google_id=:check ", nativeQuery = true)
	UserEntity checkuserbygoogleid(@Param("check") String check);
}



