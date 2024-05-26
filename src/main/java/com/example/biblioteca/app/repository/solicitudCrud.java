package com.example.biblioteca.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.biblioteca.app.entity.Solicitud;

public interface solicitudCrud extends JpaRepository<Solicitud, Long>{

}

