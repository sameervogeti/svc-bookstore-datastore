package com.bookstore.datastore.controller;

import com.bookstore.datastore.entity.Book;
import com.bookstore.datastore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;
    @GetMapping("/getBookDetails/{id}")
    public List<Book> getBookDetailsbyId(@PathVariable("id") Integer id)
    {
        return bookService.findBookById(id);
    }
}
