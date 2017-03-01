package com.rohit.book.services;

import com.rohit.book.models.Book;
import rx.Observable;

/**
 * Created by i851043 on 2/27/17.
 */
public interface BookService {

    Observable<Book> getBooks(String userId);
}
