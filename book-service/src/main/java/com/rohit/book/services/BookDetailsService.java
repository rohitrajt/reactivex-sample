package com.rohit.book.services;

import com.rohit.book.models.BookDetails;
import rx.Observable;

/**
 * Created by rohitrajt on 2/24/17.
 */
public interface BookDetailsService {

    Observable<BookDetails> getDetails(String isbn);

    Observable<BookDetails> getDetailsForUserId(String userId);
}
