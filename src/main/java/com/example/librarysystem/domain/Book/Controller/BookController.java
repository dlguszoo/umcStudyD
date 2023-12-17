package com.example.librarysystem.domain.Book.Controller;

import com.example.librarysystem.domain.Book.Dto.BookSearchDTO;
import com.example.librarysystem.domain.Book.Service.BookService;
import com.example.librarysystem.domain.Book.Dto.BookRegisterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping(value = "/book/register")
    public String register(@RequestBody BookRegisterDTO bookRegisterDTO) {
        Long id = this.bookService.register(bookRegisterDTO);
        return String.format("redirect:book/%s", id);
    }

    @GetMapping(value = "/book")
    public ResponseEntity<BookSearchDTO> search(@PathVariable Long id) {
        try{
            BookSearchDTO bookSearchDTO = this.bookService.search(id);
            return new ResponseEntity<>(bookSearchDTO, HttpStatus.OK);
        } catch (NoSuchElementException ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
