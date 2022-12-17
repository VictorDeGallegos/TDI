package com.student.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.api.entity.Country;
import com.student.api.entity.Horario;
import com.student.api.entity.Student;
import com.student.api.service.SvcCountry;
import com.student.api.service.SvcHorario;
import com.student.api.service.SvcStudent;

@Controller
public class CtrlStudent {
    
    @Autowired
    SvcStudent svcStudent;

    @Autowired
    SvcHorario svcHorario;

    @Autowired
    SvcCountry svcCountry;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/register-student")
    public String createStudent(@ModelAttribute Student in) {
        svcStudent.createStudent(in);
        return "redirect:/";
    }

    @PostMapping("/register-horario")
    public String createHorario(@ModelAttribute Horario in) {
        svcHorario.createHorario(in);
        return "horario registrado";
    }
    
    @GetMapping("/getMateria")
    public Horario getMateria(String materia) {
        return svcHorario.getByMateria(materia);
    }

    @GetMapping("/getCountries")
    public List<Country> getCountries() {
        return svcCountry.getAll();
    }

}
