package com.sda.books.domain.port;

import com.sda.books.domain.Book;

import java.util.List;

public interface BooksRepository {
    List<Book> findAll();
    List<Book> findByAuthor(String author);
}
