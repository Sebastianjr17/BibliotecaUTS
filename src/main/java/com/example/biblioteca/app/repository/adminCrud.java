package com.example.biblioteca.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.biblioteca.app.entity.Admin;

public interface adminCrud extends JpaRepository<Admin, Long>{

}
