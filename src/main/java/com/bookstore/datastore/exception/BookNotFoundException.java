package com.bookstore.datastore.exception;




public class BookNotFoundException extends Throwable {
    private String message;
    public BookNotFoundException(String message)
    {
        super(message);
    }

}
