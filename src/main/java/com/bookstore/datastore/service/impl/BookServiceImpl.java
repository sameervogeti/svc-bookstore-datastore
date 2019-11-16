package com.bookstore.datastore.service.impl;

import com.bookstore.datastore.entity.Book;
import com.bookstore.datastore.exception.BookNotFoundException;
import com.bookstore.datastore.repository.BookRepository;
import com.bookstore.datastore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Override
    public List<Book> findBookById(Integer id) {
        return bookRepository.findAll();
    }

    @Override
    public Book updateBookDetails(Book updateBook) throws BookNotFoundException {
        if(bookRepository.existsById(updateBook.getBookId()))
        {
            return bookRepository.saveAndFlush(updateBook);
        }
        else
        {
            throw new BookNotFoundException("Book Not found to update");
        }


    }

    @Override
    public Book addBook(Book booktoAdd) {
        return bookRepository.saveAndFlush(booktoAdd);
    }

    @Override
    public void deleteBook(Book booktoDelete) throws BookNotFoundException {
        if(bookRepository.existsById(booktoDelete.getBookId()))
        {
            bookRepository.delete(booktoDelete);
        }
        else
        {
            throw new BookNotFoundException("Book Not found to update");
        }
    }
}
