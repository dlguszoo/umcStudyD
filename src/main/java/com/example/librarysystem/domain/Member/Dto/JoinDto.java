package com.example.librarysystem.domain.Member.Dto;

import com.example.librarysystem.domain.Member.Entity.Gender;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JoinDto {
    private String password;

    private String email;

    private String phoneNum;

    private String name;

    private Gender gender;
}
