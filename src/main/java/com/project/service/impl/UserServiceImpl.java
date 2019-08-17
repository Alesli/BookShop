package com.project.service.impl;

import com.project.entity.User;
import com.project.repository.UserRepository;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User findOne(Long id) {
        return repository.findUserById(id);
    }

    @Override
    public User findOneByPass(String pass) {
        return repository.findUserByPass(pass);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
