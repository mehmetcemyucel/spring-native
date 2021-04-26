package com.cem.springnativeexample.repository;


import com.cem.springnativeexample.repository.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}