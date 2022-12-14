package com.tarea4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "detalles")
public class UserDtls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nombre", nullable = false, length = 50)
    private String name;

    @Column(name = "Apellido", nullable = false, length = 50)
    private String lastname;

    @Column(name = "Genero", nullable = false, length = 50)
    private String gender;

    @Column(name = "Cumpleaños", nullable = false, length = 50)
    private String dob;

    @Column(name = "Email", nullable = false, length = 50)
    private String email;

    @Column(name = "Seccion", nullable = false, length = 50)
    private String section;

    @Column(name = "Pais", nullable = false, length = 50)
    private String country;

    @Column(name = "Primer_intento", nullable = false)
    private Boolean firstattempt;

    @Column(name = "Materia", nullable = false, length = 50)
    private String subject;

    public UserDtls() { // Constructor vacio
    }

    public UserDtls(Long id, String name, String lastname, String gender, String dob, String email,
            String section, String country, Boolean firstattempt, String subject) { // Constructor normal
        super();
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.section = section;
        this.country = country;
        this.firstattempt = firstattempt;
        this.subject = subject;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDayOfBirth() {
        return this.dob;
    }

    public void setDayOfBirth(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSection() {
        return this.section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean isFirstAttempt() {
        return this.firstattempt;
    }

    public Boolean getFirstAttempt() {
        return this.firstattempt;
    }

    public void setFirstAttempt(Boolean firstattempt) {
        this.firstattempt = firstattempt;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", lastname='" + getLastName() + "'" +
                ", gender='" + getGender() + "'" +
                ", dob='" + getDayOfBirth() + "'" +
                ", email='" + getEmail() + "'" +
                ", section='" + getSection() + "'" +
                ", country='" + getCountry() + "'" +
                ", firstattempt='" + isFirstAttempt() + "'" +
                ", subject='" + getSubject() + "'" +
                "}";
    }

}
