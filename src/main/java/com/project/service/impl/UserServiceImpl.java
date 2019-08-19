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
    public User findOne(Integer id) {
        return userRepository.getOne(id);
    }

    @Override
    public User findOneByPass(String pass) {
        return userRepository.findUserByPass(pass);
    }

    @Override
    public User findUserByIdAndName(Integer id, String name) {
        return userRepository.findUserByIdAndName(id, name);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

}
