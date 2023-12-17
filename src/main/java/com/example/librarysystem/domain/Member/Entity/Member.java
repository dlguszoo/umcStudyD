package com.example.librarysystem.domain.Member.Entity;

import com.example.librarysystem.domain.Level.Level;
import com.example.librarysystem.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20, unique = true)
    private String phoneNum;

    @Column(nullable = false, length = 30, unique = true)
    private String email;

    @Column(nullable = false, length = 10)
    private String name;

    @Column(nullable = false, length = 20, unique = true)
    private String nickname;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(10)")
    private Gender gender;

    private LocalDate inactiveDate;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(15) DEFAULT 'ACTIVE'")
    private Status staus;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "level_id")
    private Level level;
}
