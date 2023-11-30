package com.example.librarysystem.domain.Book.Service;

import com.example.librarysystem.domain.Book.Dto.BookEditDTO;
import com.example.librarysystem.domain.Book.Dto.BookRegisterDTO;
import com.example.librarysystem.domain.Book.Dto.BookSearchDTO;
import com.example.librarysystem.domain.Book.Entity.Book;
import com.example.librarysystem.domain.Book.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public Long register(BookRegisterDTO bookRegisterDTO) {
        Book book = Book.builder()
                .name(bookRegisterDTO.getName())
                .publisher(bookRegisterDTO.getPublisher())
                .author(bookRegisterDTO.getAuthor())
                .description(bookRegisterDTO.getDescription())
                .classification(bookRegisterDTO.getClassification())
                .build();
        this.bookRepository.save(book);
        return book.getId();
    }

    public BookSearchDTO search(Long id) {
        Book book = this.bookRepository.findById(id).orElseThrow();
        BookSearchDTO bookSearchDTO = new BookSearchDTO();
        bookSearchDTO.fromBook(book);
        return bookSearchDTO;
    }

    public BookEditDTO edit(Long id) throws NoSuchElementException {

    }
}
