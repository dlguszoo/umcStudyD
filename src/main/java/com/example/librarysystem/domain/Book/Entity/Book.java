package com.example.librarysystem.domain.Book.Entity;

import com.example.librarysystem.domain.common.BaseEntity;
import com.example.librarysystem.domain.Rent.Rent;
import com.example.librarysystem.domain.Reserve.Reserve;
import com.example.librarysystem.domain.Saved.Saved;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Book extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 40)
    private String name;

    @Column(nullable = false, length = 20)
    private String publisher;

    @Column(nullable = false, length = 20)
    private String author;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false, length = 20)
    private String classification;
}
