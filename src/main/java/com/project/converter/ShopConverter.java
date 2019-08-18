package com.project.converter;

import com.project.dto.BookDto;
import com.project.dto.ShopBookDto;
import com.project.dto.ShopDto;
import com.project.entity.Book;
import com.project.entity.Shop;

import java.util.ArrayList;
import java.util.List;

public class ShopConverter {

    public static ShopDto getShopDto(Shop shop) {

        ShopDto shopDto = new ShopDto();
        shopDto.setId(shop.getId());
        shopDto.setName(shop.getName());
        shopDto.setCash(shop.getCash());
        return shopDto;
    }

    public static ShopBookDto getShopBookDto(Shop shop) {

        ShopBookDto shopBookDto = new ShopBookDto();
        shopBookDto.setId(shop.getId());
        shopBookDto.setName(shop.getName());
        shopBookDto.setCash(shop.getCash());

        List<Book> bookList = shop.getBooks();
        List<BookDto> bookDtoList = new ArrayList<>(bookList.size());
        for (Book book : bookList) {
            bookDtoList.add(BookConverter.getBookDTO(book));
        }
        shopBookDto.setBookDtoList(bookDtoList);
        return shopBookDto;
    }
}
