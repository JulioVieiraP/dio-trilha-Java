package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Integer>{
}
