package com.rohit.book.rating.services.impl;

import com.rohit.book.rating.model.Rating;
import com.rohit.book.rating.services.BookRatingService;
import org.springframework.stereotype.Component;

/**
 * Created by rohitrajt on 2/24/17.
 */
@Component(value = "bookRatingService")
public class BookRatingServiceImpl implements BookRatingService {


    @Override
    public Rating getRating(String isbn) {

        Rating rating = new Rating();

        rating.setRank("5");
        rating.setBestSeller(true);

        return rating;
    }
}
