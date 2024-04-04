package com.example.demo.contorllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @GetMapping("/contact")
    public String ab(Model model){
        return "contact";
    }
}
