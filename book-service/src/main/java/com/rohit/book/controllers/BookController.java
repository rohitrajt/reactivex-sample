package com.rohit.book.controllers;

import com.rohit.book.models.Book;
import com.rohit.book.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import rx.Subscriber;

import java.util.List;

/**
 * Created by i851043 on 2/27/17.
 */
@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/dashboard")
    public DeferredResult<List<Book>> getBooksForDashBoard(@RequestParam(value = "userId") String userId) {
        DeferredResult<List<Book>> result = new DeferredResult<List<Book>>();
        bookService.getBooks(userId).toList().subscribe(new Subscriber<List<Book>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable throwable) {
                result.setErrorResult(throwable);
            }

            @Override
            public void onNext(List<Book> books) {
                result.setResult(books);

            }
        });

        return result;

    }

}

