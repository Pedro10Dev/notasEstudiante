package com.example.notasestudiantes.entity;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="primer_nombre",nullable = false)
    private String primerNombre;
    @Column(name="segundo_nombre")
    private String segundoNombre;
    @Column(name="primer_apellido",nullable = false)
    private String primerApellido;
    @Column(name="segundo_apellido")
    private String SegundoApellido;
    @Column(name="fecha_nacimiento")
    private Date fechaNacimiento;
    @OneToOne(mappedBy = "persona", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Profesor profesor;
    @OneToOne(mappedBy = "persona", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Estudiante estudiante;


}
