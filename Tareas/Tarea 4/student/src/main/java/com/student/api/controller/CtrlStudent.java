package com.student.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.api.entity.Student;
import com.student.api.service.SvcStudent;

@Controller
public class CtrlStudent {
    
    @Autowired
    SvcStudent svc;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/register")
    public String createStudent(@ModelAttribute Student in) {
        System.out.println(in);
        svc.createStudent(in);
        return "redirect:/";
    }

}
