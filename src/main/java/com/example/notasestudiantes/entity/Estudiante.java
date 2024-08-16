package com.example.notasestudiantes.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String grado;
    @OneToOne
    @JoinColumn(name="persona_id")
    private Persona persona;
    @OneToMany(mappedBy = "estudiante", cascade = CascadeType.ALL,fetch= FetchType.LAZY)
    private List<Inscripcion> inscripcion;
    @OneToMany(mappedBy = "estudiante", cascade = CascadeType.ALL,fetch= FetchType.LAZY)
    private List<Nota> nota;
}
