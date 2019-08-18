package com.project.service.impl;

import com.project.entity.Book;
import com.project.repository.BookRepository;
import com.project.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book findBooksByIdFromShop(Integer bookId) {
        return bookRepository.findBooksByIdFromShop(bookId);
    }
}
