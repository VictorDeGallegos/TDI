package com.student.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.api.entity.Horario;

public interface RepoHorario extends JpaRepository<Horario, Integer> {
    
}
