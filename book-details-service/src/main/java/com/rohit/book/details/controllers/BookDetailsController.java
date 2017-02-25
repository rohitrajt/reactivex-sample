package com.rohit.book.details.controllers;

import com.rohit.book.details.models.BookDetails;
import com.rohit.book.details.models.BookDetailsListResponse;
import com.rohit.book.details.services.BookDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rohitrajt on 2/24/17.
 */
@RestController
public class BookDetailsController {

    @Autowired
    BookDetailsService bookDetailService;

    @RequestMapping(value = "")
    public BookDetails getBookDetails(@RequestParam(value = "isbn") String isbn) {
        return bookDetailService.getBookDetails(isbn);
    }

    @RequestMapping(value = "/list")
    public BookDetailsListResponse getBookDetailsForUser(@RequestParam(value = "userId") String userId) {
        BookDetailsListResponse response = new BookDetailsListResponse();

        response.setBooks(bookDetailService.getBookDetailsForUser(userId));

        return response;
    }
}
