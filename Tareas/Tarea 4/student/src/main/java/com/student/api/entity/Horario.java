package com.student.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "horario")
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "materia")
    private String materia;

    @Column(name = "semestre")
    private String semestre;

    @Column(name = "profesor")
    private String profesor;

    @Column(name = "creditos")
    private String creditos;

    @Column(name = "salon")
    private String salon;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMateria() {
        return this.materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getSemestre() {
        return this.semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getProfesor() {
        return this.profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getCreditos() {
        return this.creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getSalon() {
        return this.salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

}
