package com.example.notasestudiantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.notasestudiantes.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
}
