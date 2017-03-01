package com.rohit.book.services.impl;

import com.rohit.book.models.BookRating;
import com.rohit.book.services.BookRatingsService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import rx.Observable;

/**
 * Created by i851043 on 2/27/17.
 */
@Component(value = "bookRatingService")
public class BookRatingServiceImpl implements BookRatingsService {

    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public Observable<BookRating> getRating(String isbn) {

        Observable.create(subscriber -> {
            try {
                ResponseEntity<BookRating> responseEntity = restTemplate.getForEntity("http://localhost:8081/book/rating?isbn=12345", BookRating.class);

                subscriber.onNext(responseEntity.getBody());
                subscriber.onCompleted();
            } catch (Exception e) {
                subscriber.onError(e);
            }
        });
        return null;
    }
}
