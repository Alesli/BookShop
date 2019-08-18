package com.project.service;

import com.project.entity.User;

import java.util.List;

public interface UserService {

    User findOne(Integer id);

    User findOneByPass(String pass);

    List<User> findAll();
}
