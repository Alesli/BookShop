package com.project.service;

import com.project.entity.User;

public interface UserService {

    User findOneById(Integer id);

    User findOneByName(String name);

    boolean isCashEnough(Integer id, Double cash);

    User updateCash(Integer id, Double cash);

    User save(User user);

}
