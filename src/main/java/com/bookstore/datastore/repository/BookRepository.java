package com.bookstore.datastore.repository;

import com.bookstore.datastore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
