package com.tarea4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tarea4.entity.UserDtls;

@Controller
public class UserController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute UserDtls userDtls) {
        System.out.println(userDtls);
        return "redirect:/";
    }

}
