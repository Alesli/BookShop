package com.project.facade;

import com.project.dto.*;
import com.project.entity.Book;

import java.util.List;

public interface ShopFacade {

//    BookShopDto findBookByIdFromShop(Integer bookId);

    UserDto findOneUserByName(String userName);

    ShopDto findOneShopById(Integer shopId);

    List<ShopDto> findAllShops();

    long countShops();

    List<BookShopDto> findAllShopsBooks();

    List<UserBookDto> findAllUsersBooks();

    Book saleBook(Integer shopId, Integer userId, Integer bookId);

}
