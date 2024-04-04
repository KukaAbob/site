package com.example.demo.contorllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class MainController {
    @GetMapping("/")
    public String hello(Model model){
        model.addAttribute("title" , "mainPage");
        return "hello";
    }
    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("about" , "mainPage");
        return "hello";
    }

}
