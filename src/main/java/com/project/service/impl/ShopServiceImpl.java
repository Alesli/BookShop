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
    public Shop findOneById(Long id) {
        return shopRepository.getOne(id);
    }

    @Override
    public List<Shop> findAll() {
        return shopRepository.findAll();
    }

    @Override
    public Shop updateCash(Long id, Double cash) {
        Shop shop = findOneById(id);
        shop.setCash(shop.getCash() + cash);
        return save(shop);
    }

    @Override
    public Shop save(Shop shop) {
        return shopRepository.save(shop);
    }
}
