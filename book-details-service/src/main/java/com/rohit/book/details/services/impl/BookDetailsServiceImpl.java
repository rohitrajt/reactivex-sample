package com.rohit.book.details.services.impl;

import com.rohit.book.details.models.BookDetails;
import com.rohit.book.details.services.BookDetailsService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rohitrajt on 2/24/17.
 */
@Component(value = "bookDetailService")
public class BookDetailsServiceImpl implements BookDetailsService {


    @Override
    public BookDetails getBookDetails(String isbn) {
        BookDetails details = new BookDetails();

        details.setIsbn(isbn);
        details.setName("Harry Potter And The Goblet Of Fire");
        details.setAuthor("J.K. Rowling");

        return details;
    }

    @Override
    public List<BookDetails> getBookDetailsForUser(String userId) {
        List<BookDetails> list = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            BookDetails details = new BookDetails();

            details.setIsbn("isbn" + i);
            details.setName("Harry Potter " + i);
            details.setAuthor("J.K. Rowling");

            list.add(details);
        }
        return list;
    }
}
