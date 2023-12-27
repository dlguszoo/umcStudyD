package com.example.librarysystem.domain.Book.Dto;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BookRequestDTO {
    private String name;
    private String publisher;
    private String author;
    private String description;
    private String classification;
}
