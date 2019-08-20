package com.project.service;

import com.project.entity.Book;

import java.util.List;

public interface BookService {

    Book findOneById(Integer id);

    List<Book> findAll();

    Book saleFromShop(Integer bookId, Integer shopId);

    Book addToUser(Integer bookId, Integer userId);

}
