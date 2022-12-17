package com.student.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.api.entity.Country;

public interface RepoCountry extends JpaRepository<Country, Integer>{
    
}
