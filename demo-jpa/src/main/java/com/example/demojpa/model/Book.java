package com.example.demojpa.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ani
 * @date 2021/1/12 16:24
 * @description Book
 */
@Entity
@Data
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    private String bookName;

}
