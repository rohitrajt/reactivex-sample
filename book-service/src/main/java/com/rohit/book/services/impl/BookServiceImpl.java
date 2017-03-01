package com.rohit.book.services.impl;

import com.rohit.book.models.Book;
import com.rohit.book.models.BookDetails;
import com.rohit.book.models.BookRating;
import com.rohit.book.services.BookDetailsService;
import com.rohit.book.services.BookRatingsService;
import com.rohit.book.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rx.Observable;

/**
 * Created by i851043 on 2/27/17.
 */
@Component(value = "bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    BookDetailsService bookDetailsService;

    @Autowired
    BookRatingsService bookRatingsService;

    @Override
    public Observable<Book> getBooks(String userId) {
        Observable<BookDetails> bookDetails = bookDetailsService.getDetailsForUserId(userId);

        return bookDetails.flatMap(detail -> {
            Observable<BookRating> bookRating = bookRatingsService.getRating(detail.getIsbn());

            Observable<BookDetails> bookDetailsObservable = Observable.just(detail);

            return Observable.zip(bookDetailsObservable, bookRating, (detail1, rating) -> {
                Book book = new Book();
                book.setBookDetails(detail1);
                book.setBookRating(rating);
                return book;
            });
        });
    }
}
