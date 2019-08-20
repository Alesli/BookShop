package com.project.facade.impl;

import com.project.converter.BookConverter;
import com.project.converter.ShopConverter;
import com.project.converter.UserConverter;
import com.project.dto.*;
import com.project.entity.Book;
import com.project.entity.Shop;
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
    public ShopDto findOneShopById(Integer shopId) {
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
        return null;
    }

    @Override
    public List<UserBookDto> findAllUsersBooks() {
        return null;
    }

    @Override
    public Book saleBook(Integer shopId, Integer userId, Integer bookId) {
        return null;
    }
}
