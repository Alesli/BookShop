package com.project.facade;

import com.project.dto.BookShopDto;
import com.project.dto.BookUserDto;

public interface ShopFacade {

    BookShopDto findBooksByIdFromShop(Integer bookId);

}
