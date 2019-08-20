package com.project.facade;

import com.project.dto.*;
import com.project.entity.Book;

import java.util.List;

public interface ShopFacade {

    UserDto findOneUserByName(String userName);

    ShopDto findOneShopById(Long shopId);

    List<ShopDto> findAllShops();

    long countShops();

    List<BookDto> findBooksByShopId(Long shopId);

    List<BookDto> findBooksByUserId(Long userId);

    Book saleBook(Long shopId, Long userId, Long bookId);

    //----

    List<UserBookDto> findAllUsersBooks();

    List<ShopBookDto> findAllShopsBooks();

}
