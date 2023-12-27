package com.example.librarysystem.domain.Member.Controller;

import com.example.librarysystem.domain.Member.Dto.JoinDto;
import com.example.librarysystem.domain.Member.Service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {

    @Autowired
    private JoinService joinService;

    @GetMapping("/member/join")
    public String joinP() {
        return "join";
    }

    @PostMapping("/member/joinProc")
    public String joinProcess(JoinDto joinDto) {
        joinService.joinProcess(joinDto);
        System.out.println("환영합니다 " + joinDto.getName() + "님!");
        return "redirect:/login";
    }
}
