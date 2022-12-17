package com.student.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.api.dto.ApiResponse;
import com.student.api.entity.Student;
import com.student.api.repository.RepoStudent;

@Service
public class SvcStudentImp implements SvcStudent {

    @Autowired
    RepoStudent repo;

    @Override
    public List<Student> getStudents() {
        return repo.findAll();
    }

    @Override
    public ApiResponse createStudent(Student in) {
        repo.save(in);
        return new ApiResponse("student created");
    }
    
}
