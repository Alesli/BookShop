package com.project.service;

import com.project.entity.Shop;

import java.util.List;

public interface ShopService {

    long count();

    Shop findOneById(Integer id);

    Shop findOneByName(String name);

    List<Shop> findAll();

    Shop updateCash(Integer id, Double cash);

}
