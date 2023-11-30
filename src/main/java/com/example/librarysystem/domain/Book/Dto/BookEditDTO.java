package com.example.librarysystem.domain.Book.Dto;

import com.example.librarysystem.domain.Book.Entity.Book;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BookEditDTO {
    @NonNull
    private String name;

    @NonNull
    private String publisher;

    @NonNull
    private String author;

    @NonNull
    private String description;

    @NonNull
    private String classification;

    public Book fill(Book book) {
        book.builder()
                .name(name)
                .publisher(publisher)
                .author(author)
                .description(description)
                .classification(classification)
                .build();
        return book;
    }
}
