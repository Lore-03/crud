package com.prueba.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Data
@Table(name = "persona")
public class Persona {
    @Id
    @Column
    private Long numDocumento;
    @Column
    private Long fechaNacimiento;
    @Column
    private Long registro;
    @Column
    private String nombre;
    @Column
    private String apellido;
//Back
}
