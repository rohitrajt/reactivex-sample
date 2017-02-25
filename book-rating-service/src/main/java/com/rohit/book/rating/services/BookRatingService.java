package com.rohit.book.rating.services;

import com.rohit.book.rating.model.Rating;

/**
 * Created by rohitrajt on 2/24/17.
 */
public interface BookRatingService {

    Rating getRating(String isbn);
}
