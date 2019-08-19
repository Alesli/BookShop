package com.project.facade.impl;

import com.project.converter.BookConverter;
import com.project.dto.BookShopDto;
import com.project.entity.Book;
import com.project.facade.ShopFacade;
import com.project.service.BookService;
import com.project.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShopFacadeImpl implements ShopFacade {

    @Autowired
    private ShopService shopService;

    @Autowired
    private BookService bookService;

    @Override
    public BookShopDto findBooksByIdFromShop(Integer bookId) {

        Book book = bookService.findBooksByIdFromShop(bookId);

//        List<Book> bookList = bookService.findBooksByIdFromShop(bookId);
//        List<BookShopDto> bookShopDtoList = new ArrayList<>(bookList.size());
//        for (Book book : bookList) {
//            bookShopDtoList.add(BookConverter.getBookShopDto(book));
//        }
        return BookConverter.getBookShopDto(book);
    }


}
