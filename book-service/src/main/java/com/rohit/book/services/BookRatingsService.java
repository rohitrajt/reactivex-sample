package com.rohit.book.services;

import com.rohit.book.models.BookRating;
import rx.Observable;

/**
 * Created by rohitrajt on 2/24/17.
 */
public interface BookRatingsService {

    Observable<BookRating> getRating(String isbn);

}
