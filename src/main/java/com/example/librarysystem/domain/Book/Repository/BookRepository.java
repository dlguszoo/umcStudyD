package com.example.librarysystem.domain.Book.Repository;

import com.example.librarysystem.domain.Book.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
