package com.project.service.impl;

import com.project.entity.Book;
import com.project.repository.BookRepository;
import com.project.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book findOneById(Integer id) {
        return bookRepository.getOne(id);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book saleFromShop(Integer bookId, Integer shopId) {
        return null;
    }

    @Override
    public Book addToUser(Integer bookId, Integer userId) {
        return null;
    }
}
