package com.project.service;

import com.project.entity.User;

import java.util.List;

public interface UserService {

    User findOneById(Long id);

    User findOneByName(String name);

    List<User> findAll();

    boolean isCashEnough(Long id, Double cash);

    User updateCash(Long id, Double cash);

}
