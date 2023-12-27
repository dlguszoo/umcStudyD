package com.example.librarysystem.domain.Book.Service;

import com.example.librarysystem.domain.Book.Dto.BookRequestDTO;
import com.example.librarysystem.domain.Book.Dto.BookResponseDTO;
import com.example.librarysystem.domain.Book.Entity.Book;
import com.example.librarysystem.domain.Book.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public BookResponseDTO register(BookRequestDTO bookRequestDTO) {
        Book book = new Book(bookRequestDTO);
        Book savedBook = bookRepository.save(book);
        return new BookResponseDTO(savedBook);
    }

    public BookResponseDTO search(Long id) {
        Book book = findBook(id);
        return new BookResponseDTO(book);
    }

    public BookResponseDTO edit(Long id, BookRequestDTO bookRequestDTO) {
        Book book = findBook(id);
        book.update(bookRequestDTO);
        return new BookResponseDTO(book);
    }

    public BookResponseDTO remove(Long id) {
        Book book = findBook(id);
        bookRepository.delete(book);
        return new BookResponseDTO("책이 삭제되었습니다");
    }

    private Book findBook(Long id) {
        return bookRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("책이 존재하지 않습니다")
        );
    }
}
