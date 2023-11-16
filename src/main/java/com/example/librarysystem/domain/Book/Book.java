package com.example.librarysystem.domain.Book;

import com.example.librarysystem.domain.Classification.Classification;
import com.example.librarysystem.domain.common.BaseEntity;
import com.example.librarysystem.domain.mapping.Rent.Rent;
import com.example.librarysystem.domain.mapping.Reserve.Reserve;
import com.example.librarysystem.domain.mapping.Saved.Saved;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classification_id")
    private Classification classification;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Rent> rentList = new ArrayList<>();

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Reserve> reserveList = new ArrayList<>();

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Saved> savedList = new ArrayList<>();

}
