package com.student.api.service;

import com.student.api.dto.ApiResponse;
import com.student.api.entity.Horario;


public interface SvcHorario {
    
    public ApiResponse createHorario (Horario in);
    public Horario getByMateria(String materia);

}
