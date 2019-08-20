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

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findOneById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public User findOneByName(String name) {
        return userRepository.findOneByName(name);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    //TODO:  можно сделать вывод таблицы книг на которые пользователю хватает денег
    @Override
    public boolean isCashEnough(Long id, Double cash) {
        User user = userRepository.getOne(id);
        Double cashUser = user.getCash();
        return cashUser >= cash;
    }

    @Override
    public User updateCash(Long id, Double cash) {
        User user = userRepository.getOne(id);
        user.setCash(cash);
        return userRepository.save(user);
    }
}
