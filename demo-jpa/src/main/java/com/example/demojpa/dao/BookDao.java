package com.example.demojpa.dao;

import com.example.demojpa.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;

/**
 * @author ani
 * @date 2021/1/12 16:41
 * @description BookDao
 */
public interface BookDao extends JpaRepository<Book, Long>, Serializable {
    /**
     * 按书名查询
     * @param bookName 书名
     * @return 书
     */
    @Query("FROM Book WHERE bookName=:bookName")
    Book findBookByName(String bookName);
}
