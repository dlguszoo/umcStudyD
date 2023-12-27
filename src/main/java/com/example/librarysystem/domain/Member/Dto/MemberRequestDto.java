package com.example.librarysystem.domain.Member.Dto;

import com.example.librarysystem.domain.Level.Level;
import com.example.librarysystem.domain.Member.Entity.Gender;
import com.example.librarysystem.domain.Member.Entity.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberRequestDto {

    private Long id;

    private String phoneNum;

    private String email;

    private String name;

    private String password;

    private Gender gender;

    private LocalDate inactiveDate;

    private Status staus;

    private Level level;
}
