package com.student.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.api.dto.ApiResponse;
import com.student.api.entity.Horario;
import com.student.api.repository.RepoHorario;

@Service
public class SvcHorarioImp implements SvcHorario{

    @Autowired
    RepoHorario repo;

    @Override
    public ApiResponse createHorario(Horario in) {
        repo.save(in);
        return new ApiResponse("horario created");
    }

    public Horario getByMateria(String materia) {
        return repo.findByMateria(materia);
    }


}