package com.rohit.book.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

/**
 * Created by rohitrajt on 2/24/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookDetailsListResponse implements Serializable {

    private List<BookDetails> books;

    public List<BookDetails> getBooks() {
        return books;
    }

    public void setBooks(List<BookDetails> books) {
        this.books = books;
    }
}
