package com.example.notasestudiantes.DTO;

import java.sql.Date;

import lombok.Data;

@Data
public class EstudianteDTO {
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private String grado;
}
