package com.rohit.book.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by i851043 on 2/27/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Book implements Serializable {

    private BookDetails bookDetails;

    private BookRating bookRating;

    public BookDetails getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(BookDetails bookDetails) {
        this.bookDetails = bookDetails;
    }

    public BookRating getBookRating() {
        return bookRating;
    }

    public void setBookRating(BookRating bookRating) {
        this.bookRating = bookRating;
    }
}
