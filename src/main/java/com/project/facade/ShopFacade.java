package com.project.facade;

import com.project.dto.BookShopDto;

public interface ShopFacade {

    BookShopDto findBooksByIdFromShop(Integer bookId);
}
