package com.example.notasestudiantes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.notasestudiantes.entity.Estudiante;
import com.example.notasestudiantes.repository.EstudianteRepository;

@Service
public class EstudianteServivio {
    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> getEstudiantes() {
        return estudianteRepository.findAll();
    }

    public Optional<Estudiante> getEstudiantes(Long id) {
        return estudianteRepository.findById(id);
    }

    public void saveOrUpdateEstudiante(Estudiante estudiante){
        estudianteRepository.save(estudiante);
    }
}
