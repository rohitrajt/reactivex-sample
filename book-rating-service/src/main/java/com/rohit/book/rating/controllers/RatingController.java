package com.rohit.book.rating.controllers;

import com.rohit.book.rating.model.Rating;
import com.rohit.book.rating.services.BookRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rohitrajt on 2/24/17.
 */
@RestController
public class RatingController {


    @Autowired
    BookRatingService bookRatingService;

    public Rating getBookRating(@RequestParam(value = "isbn") String isbn) {
        return bookRatingService.getRating(isbn);
    }
}
