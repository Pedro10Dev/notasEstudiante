package com.example.notasestudiantes.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_materia")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre_materia",nullable = false)
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesor profesor;
    @OneToMany(mappedBy = "materia", cascade = CascadeType.ALL)
    private List<Inscripcion> inscripcion;
    @OneToMany(mappedBy = "materia", cascade = CascadeType.ALL)
    private List<Nota> nota;
    
}
