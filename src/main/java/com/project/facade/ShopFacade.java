package com.project.facade;

import com.project.dto.*;
import com.project.entity.Book;

import java.util.List;

public interface ShopFacade {

//    BookShopDto findBookByIdFromShop(Integer bookId);

    UserDto findOneUserByName(String userName);

    ShopDto findOneShopById(Long shopId);

    List<ShopDto> findAllShops();

    long countShops();

    List<ShopBookDto> findAllShopsBooks();

    List<UserBookDto> findAllUsersBooks();

    Book saleBook(Long shopId, Long userId, Long bookId);

}
