package com.project.facade.impl;

import com.project.converter.BookConverter;
import com.project.converter.ShopConverter;
import com.project.converter.UserConverter;
import com.project.dto.*;
import com.project.entity.Book;
import com.project.entity.Shop;
import com.project.entity.User;
import com.project.facade.ShopFacade;
import com.project.service.BookService;
import com.project.service.ShopService;
import com.project.service.UserService;
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

    @Autowired
    private UserService userService;

    @Override
    public UserDto findOneUserByName(String userName) {
        return UserConverter.getUserDto(
                userService.findOneByName(userName));
    }

    @Override
    public ShopDto findOneShopById(Long shopId) {
        return ShopConverter.getShopDto(shopService.findOneById(shopId));
    }

    @Override
    public List<ShopDto> findAllShops() {
        List<Shop> shopList = shopService.findAll();
        List<ShopDto> shopDtoList = new ArrayList<>(shopList.size());
        for (Shop shops : shopList) {
            shopDtoList.add(ShopConverter.getShopDto(shops));
        }
        return shopDtoList;
    }

    @Override
    public long countShops() {
        return shopService.count();
    }

    @Override
    public List<ShopBookDto> findAllShopsBooks() {
        List<Shop> shopList = shopService.findAll();
        List<ShopBookDto> shopBookDtoList = new ArrayList<>(shopList.size());
        for (Shop shops : shopList) {
            shopBookDtoList.add(ShopConverter.getShopBookDto(shops));
        }
        return shopBookDtoList;
    }

    @Override
    public List<BookDto> findBooksByShopId(Long shopId) {
        Shop shop = shopService.findOneById(shopId);
        List<Book> bookList = shop.getBooks();
        List<BookDto> bookDtoList = new ArrayList<>(shop.getBooks().size());
        for (Book books : bookList) {
            bookDtoList.add(BookConverter.getBookDTO(books));
        }
        return bookDtoList;
    }

    @Override
    public List<BookDto> findBooksByUserId(Long userId) {
        User user = userService.findOneById(userId);
        List<Book> bookList = user.getBooks();
        List<BookDto> bookDtoList = new ArrayList<>(user.getBooks().size());
        for (Book books : bookList) {
            bookDtoList.add(BookConverter.getBookDTO(books));
        }
        return bookDtoList;
    }

    @Override
    public List<UserBookDto> findAllUsersBooks() {
        List<User> userList = userService.findAll();
        List<UserBookDto> userBookDtoList = new ArrayList<>(userList.size());
        for (User users : userList) {
            userBookDtoList.add(UserConverter.getUserBookDto(users));
        }
        return userBookDtoList;
    }

    @Override
    public Book saleBook(Long shopId, Long userId, Long bookId) {
        return null;
    }
}
