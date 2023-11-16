package com.example.librarysystem.domain.User;

import com.example.librarysystem.domain.Book.Book;
import com.example.librarysystem.domain.Level.Level;
import com.example.librarysystem.domain.common.BaseEntity;
import com.example.librarysystem.domain.mapping.Rent.Rent;
import com.example.librarysystem.domain.mapping.Reserve.Reserve;
import com.example.librarysystem.domain.mapping.Saved.Saved;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String phoneNum;

    @Column(nullable = false, length = 30)
    private String email;

    @Column(nullable = false, length = 10)
    private String name;

    @Column(nullable = false, length = 20)
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

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Rent> rentList = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Reserve> reserveList = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Saved> savedList = new ArrayList<>();

}
