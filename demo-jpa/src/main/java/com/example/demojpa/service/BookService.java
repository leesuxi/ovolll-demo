package com.example.demojpa.service;

import com.example.demojpa.model.Book;

import java.util.List;

/**
 * @author ani
 * @date 2021/1/12 16:43
 * @description BookService
 */
public interface BookService {
    /**
     * 查询所有图书
     * @return 所有图书
     */
    List<Book> books();

    /**
     * 按书名查询
     * @param bookName 书名
     * @return 书
     */
    Book getBookByName(String bookName);

    /**
     * 插入一本书
     * @param book 实体
     * @return 结果
     */
    int postBook(Book book);

    /**
     * 删除一本书
     * @param book 书id
     * @return 结果
     */
    int deleteBookById(Book book);


}
