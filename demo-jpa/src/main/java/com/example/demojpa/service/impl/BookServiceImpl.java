package com.example.demojpa.service.impl;

import com.example.demojpa.dao.BookDao;
import com.example.demojpa.model.Book;
import com.example.demojpa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ani
 * @date 2021/1/12 16:46
 * @description BookServiceImpl
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> books() {
        return bookDao.findAll();
    }

    @Override
    public Book getBookByName(String bookName) {
        return bookDao.findBookByName(bookName);
    }

    @Override
    public int postBook(Book book) {
        Book save = bookDao.save(book);
        return save==null?0:1;
    }

    @Override
    public int deleteBookById(Book book) {
        bookDao.delete(book);
        return 1;
    }




}
