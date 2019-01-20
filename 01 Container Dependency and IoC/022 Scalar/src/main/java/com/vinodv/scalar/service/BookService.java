package com.vinodv.scalar.service;

import com.vinodv.scalar.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookService {

    @Autowired
    private Book book;

    public void printBook() {
        System.out.println(book);
    }

}
