package com.example.librarysystem.domain.Member.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/member")
    public String mainP() {

        return "main";
    }
}
