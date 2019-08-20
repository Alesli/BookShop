package com.project.service.impl;

import com.project.entity.User;
import com.project.repository.BookRepository;
import com.project.repository.UserRepository;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public User findOneById(Integer id) {
        return userRepository.getOne(id);
    }

    @Override
    public User findOneByName(String name) {
        return userRepository.findOneByName(name);
    }

    @Override
    public boolean isCashEnough(Integer id, Double cash) {
        return false;
    }

    @Override
    public User updateCash(Integer id, Double cash) {
        User user = userRepository.getOne(id);
        return null;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

}
