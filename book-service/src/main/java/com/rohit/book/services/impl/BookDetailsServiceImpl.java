package com.rohit.book.services.impl;

import com.rohit.book.models.BookDetails;
import com.rohit.book.models.BookDetailsListResponse;
import com.rohit.book.services.BookDetailsService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import rx.Observable;

/**
 * Created by i851043 on 2/27/17.
 */
@Component("bookDetailsService")
public class BookDetailsServiceImpl implements BookDetailsService {

    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public Observable<BookDetails> getDetails(String isbn) {
        return null;
    }

    @Override
    public Observable<BookDetails> getDetailsForUserId(String userId) {

        return Observable.create(subscriber -> {
            try {
                ResponseEntity<BookDetailsListResponse> bookDetails = restTemplate.getForEntity("http://localhost:8080/book/details/list?userId=12345", BookDetailsListResponse.class);

                for (BookDetails details : bookDetails.getBody().getBooks()) {
                    subscriber.onNext(details);
                    subscriber.onCompleted();
                }
            } catch (Exception e) {
                subscriber.onError(e);
            }
        });
    }
}
