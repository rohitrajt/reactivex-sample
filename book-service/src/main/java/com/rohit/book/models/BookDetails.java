package com.rohit.book.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BookDetails implements Serializable {

    private String isbn;

    private String author;

    private String name;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
