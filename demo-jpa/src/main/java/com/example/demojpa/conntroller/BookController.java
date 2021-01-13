package com.example.demojpa.conntroller;

import com.example.demojpa.model.Book;
import com.example.demojpa.service.BookService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ani
 * @date 2021/1/12 16:48
 * @description BookController
 */
@Log4j2
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("book")
    public List<Book> getBooks() {
        return bookService.books();
    }
    @GetMapping("/book/{bookName}")
    public Book getBookByName(@PathVariable String bookName) {
        return bookService.getBookByName(bookName);
    }

    @PostMapping("/book")
    public int postBook(Book book){
        log.info(book);
        return bookService.postBook(book);
    }

    @DeleteMapping("/book")
    public int deleteBook(Book book){
        return bookService.deleteBookById(book);
    }

    @PutMapping("/book")
    public int putBook(Book book){
        return bookService.postBook(book);
    }
}
