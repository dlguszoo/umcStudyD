package com.example.librarysystem.domain.Book.Controller;

import com.example.librarysystem.domain.Book.Dto.BookResponseDTO;
import com.example.librarysystem.domain.Book.Service.BookService;
import com.example.librarysystem.domain.Book.Dto.BookRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping(value = "/book/register")
    public BookResponseDTO register(@RequestBody BookRequestDTO bookRequestDTO) {
        return bookService.register(bookRequestDTO);
    }
    @GetMapping(value = "/book")
    public BookResponseDTO search(@PathVariable Long id) {
        return bookService.search(id);
    }
    @PatchMapping(value = "/book")
    public BookResponseDTO edit(@PathVariable Long id, @RequestBody BookRequestDTO bookRequestDTO) {
        return bookService.edit(id, bookRequestDTO);
    }
    @DeleteMapping(value = "/book")
    public BookResponseDTO remove(@PathVariable Long id) {
        return bookService.remove(id);
    }
}
