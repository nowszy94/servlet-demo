package com.sda.books.domain;

import java.time.LocalDate;

public class Book {
    private String isbn;
    private String title;
    private String description;
    private String author;
    private LocalDate date;

    public Book() {
    }

    public Book(String isbn, String title, String description, String author, LocalDate date) {
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.author = author;
        this.date = date;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
