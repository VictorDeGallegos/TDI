package com.student.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.api.entity.Student;

@Repository
public interface RepoStudent extends JpaRepository<Student, Integer> {

}
