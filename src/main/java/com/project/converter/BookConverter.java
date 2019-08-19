package com.project.converter;

import com.project.dto.*;
import com.project.entity.Book;
import com.project.entity.Shop;
import com.project.entity.User;

import java.util.ArrayList;
import java.util.List;

public class BookConverter {

    public static BookDto getBookDTO(Book book) {

        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setName(book.getName());
        bookDto.setAuthor(book.getAuthor());
        bookDto.setDescription(book.getDescription());
        bookDto.setCost(book.getCost());
        return bookDto;
    }

    public static Book getBook(BookDto bookDto) {

        Book book = new Book();
        book.setId(bookDto.getId());
        book.setName(bookDto.getName());
        book.setAuthor(bookDto.getAuthor());
        book.setDescription(bookDto.getDescription());
        book.setCost(bookDto.getCost());
        return book;
    }

    public static BookUserDto getBookUserDto(Book book) {

        BookUserDto bookUserDto = new BookUserDto();
        bookUserDto.setId(book.getId());
        bookUserDto.setName(book.getName());
        bookUserDto.setAuthor(book.getAuthor());
        bookUserDto.setDescription(book.getDescription());
        bookUserDto.setCost(book.getCost());


        List<User> userList = book.getUsers();
        List<UserDto> userDtoList = new ArrayList<>(userList.size());
        for (User user : userList) {
            userDtoList.add(UserConverter.getUserDto(user));
        }
        bookUserDto.setUserDtoList(userDtoList);
        return bookUserDto;
    }

    public static BookShopDto getBookShopDto(Book book) {

        BookShopDto bookShopDto = new BookShopDto();
        bookShopDto.setId(book.getId());
        bookShopDto.setName(book.getName());
        bookShopDto.setAuthor(book.getAuthor());
        bookShopDto.setDescription(book.getDescription());
        bookShopDto.setCost(book.getCost());

        List<Shop> shopList = book.getShops();
        List<ShopDto> shopDtoList = new ArrayList<>(shopList.size());
        for (Shop shop : shopList) {
            shopDtoList.add(ShopConverter.getShopDto(shop));
        }
        bookShopDto.setShopDtoList(shopDtoList);
        return bookShopDto;
    }
}
