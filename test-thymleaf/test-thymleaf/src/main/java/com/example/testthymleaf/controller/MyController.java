package com.example.testthymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "Radek");
        return "hello";
    }

}
