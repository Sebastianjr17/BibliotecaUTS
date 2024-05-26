package com.example.biblioteca.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.biblioteca.app.entity.User;

public interface userCrud extends JpaRepository<User, Long>{

}

