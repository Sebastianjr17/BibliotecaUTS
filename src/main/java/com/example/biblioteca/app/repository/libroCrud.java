package com.example.biblioteca.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.biblioteca.app.entity.Libro;

public interface libroCrud extends JpaRepository<Libro, Long>{

}
