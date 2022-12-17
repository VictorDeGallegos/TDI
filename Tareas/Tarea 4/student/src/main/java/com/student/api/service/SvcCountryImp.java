package com.student.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.api.entity.Country;
import com.student.api.repository.RepoCountry;

@Service
public class SvcCountryImp implements SvcCountry{

    @Autowired
    RepoCountry repoCountry;

    @Override
    public List<Country> getAll() {
        return repoCountry.findAll();
    }
    
}
