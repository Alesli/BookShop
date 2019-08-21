package com.project.repository;

import com.project.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {

    Shop findOneById(Long id);

    List<Shop> findAll();
}
