package com.example.librarysystem.domain.Book.Dto;


import com.example.librarysystem.domain.Book.Entity.Book;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookSearchDTO {
    private String name;
    private String publisher;
    private String author;
    private String description;
    private String classification;

    public BookSearchDTO fromBook(Book book) {
        this.name = book.getName();
        this.publisher = book.getPublisher();
        this.author = book.getAuthor();
        this.description = book.getDescription();
        this.classification = book.getClassification();
        return this;
    }

    public static BookSearchDTO BookData(Book book) {
        BookSearchDTO bookSearchDTO = new BookSearchDTO();
        bookSearchDTO.fromBook(book);
        return bookSearchDTO;
    }
}
