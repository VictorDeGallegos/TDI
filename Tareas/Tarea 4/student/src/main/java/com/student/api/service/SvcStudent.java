package com.student.api.service;

import java.util.List;

import com.student.api.dto.ApiResponse;
import com.student.api.entity.Student;

public interface SvcStudent {
    
    public List<Student> getStudents();
    public ApiResponse createStudent(Student in);

}
