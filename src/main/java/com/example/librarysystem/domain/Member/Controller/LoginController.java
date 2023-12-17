package com.example.librarysystem.domain.Member.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/member/login")
    public String login() {

    }
}
