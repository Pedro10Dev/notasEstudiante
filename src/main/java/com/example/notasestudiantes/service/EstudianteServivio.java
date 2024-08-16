package com.example.notasestudiantes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.notasestudiantes.entity.Estudiante;
import com.example.notasestudiantes.entity.Persona;
import com.example.notasestudiantes.repository.EstudianteRepository;
import com.example.notasestudiantes.repository.PersonaRepository;

@Service
public class EstudianteServivio {
    @Autowired
    private EstudianteRepository estudianteRepository;
    @Autowired
    private PersonaRepository personaRepository;

    public List<Estudiante> getEstudiantes() {
        return estudianteRepository.findAll();
    }

    public Optional<Estudiante> getEstudiantes(Long id) {
        return estudianteRepository.findById(id);
    }

    public Estudiante saveOrUpdateEstudiante(Estudiante estudiante, Persona persona){

        Persona savedPersona = personaRepository.save(persona);
        estudiante.setPersona(savedPersona);
        
        return estudianteRepository.save(estudiante);
    }

    public void deleteEstudiante(Long id){
        estudianteRepository.deleteById(id);

    }
}
