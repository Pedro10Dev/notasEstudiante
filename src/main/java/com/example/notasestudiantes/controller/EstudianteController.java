package com.example.notasestudiantes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.notasestudiantes.DTO.EstudianteDTO;
import com.example.notasestudiantes.entity.Estudiante;
import com.example.notasestudiantes.entity.Persona;
import com.example.notasestudiantes.service.EstudianteServivio;

@RestController
@RequestMapping(path = "api/v1/estudiantes")
public class EstudianteController {

    @Autowired
    EstudianteServivio estudianteServivio;

    @GetMapping
    public List<Estudiante> getAll() {
        return estudianteServivio.getEstudiantes();
    }

    @GetMapping("/{estudianteId}")
    public Optional<Estudiante> getById(@PathVariable Long estudianteId) {
        return estudianteServivio.getEstudiantes(estudianteId);
    }

    @PostMapping
    public Estudiante saveOrUpdateEstudiante(@RequestBody EstudianteDTO estudianteDTO) {
        Persona persona = new Persona();
        persona.setPrimerNombre(estudianteDTO.getPrimerNombre());
        persona.setSegundoNombre(estudianteDTO.getSegundoNombre());
        persona.setPrimerApellido(estudianteDTO.getPrimerApellido());
        persona.setSegundoApellido(estudianteDTO.getSegundoApellido());
        persona.setFechaNacimiento(estudianteDTO.getFechaNacimiento());

        Estudiante estudiante = new Estudiante();
        estudiante.setGrado(estudianteDTO.getGrado());

        return estudianteServivio.saveOrUpdateEstudiante(estudiante, persona);
    }

    @DeleteMapping
    public void deleteEstudiante(@PathVariable("{estudianteId") Long estudianteId){
        estudianteServivio.deleteEstudiante(estudianteId);
    }
}
