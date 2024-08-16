package com.example.notasestudiantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.notasestudiantes.entity.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    
}
