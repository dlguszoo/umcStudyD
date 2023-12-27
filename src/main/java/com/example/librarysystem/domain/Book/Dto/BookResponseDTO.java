package com.example.librarysystem.domain.Book.Dto;


import com.example.librarysystem.domain.Book.Entity.Book;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookResponseDTO {
    private Long id;
    private String name;
    private String publisher;
    private String author;
    private String description;
    private String classification;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private String msg;

    public BookResponseDTO(Book book) {
        this.name = book.getName();
        this.publisher = book.getPublisher();
        this.author = book.getAuthor();
        this.description = book.getDescription();
        this.classification = book.getClassification();
    }

    public BookResponseDTO(String msg) {
        this.msg = msg;
    }
}
