package com.project.service.impl;

import com.project.entity.Shop;
import com.project.repository.ShopRepository;
import com.project.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopRepository shopRepository;

    @Override
    public long count() {
        return shopRepository.count();
    }

    @Override
    public Shop findOneById(Integer id) {
        return shopRepository.getOne(id);
    }

    @Override
    public Shop findOneByName(String name) {
        return shopRepository.findOneByName(name);
    }

    @Override
    public List<Shop> findAll() {
        return shopRepository.findAll();
    }

    @Override
    public Shop updateCash(Integer id, Double cash) {
        return null;
    }
}
