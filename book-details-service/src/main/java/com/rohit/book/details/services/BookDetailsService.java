package com.rohit.book.details.services;

import com.rohit.book.details.models.BookDetails;

import java.util.List;

/**
 * Created by rohitrajt on 2/24/17.
 */
public interface BookDetailsService {

    BookDetails getBookDetails(String isbn);

    List<BookDetails> getBookDetailsForUser(String userId);
}
