package com.bookstore.datastore.service;

import com.bookstore.datastore.entity.Book;
import com.bookstore.datastore.exception.BookNotFoundException;

import java.util.List;

public interface BookService {
    public List<Book> findBookById(Integer id);
    public Book updateBookDetails(Book updateBook) throws BookNotFoundException;
    public Book addBook(Book book);
    public void deleteBook(Book book) throws BookNotFoundException;
}
