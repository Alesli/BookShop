package com.project.service.impl;

import com.project.entity.User;
import com.project.repository.UserRepository;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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

    //TODO:  можно сделать вывод таблицы книг, на которые пользователю хватает денег
    @Override
    public boolean isCashEnough(Long id, Double cash) {
        User user = findOneById(id);
        return user.getCash() - cash >= 0;
    }

    @Override
    public User updateCash(Long id, Double cash) {
        if (isCashEnough(id, cash)) {
            User user = findOneById(id);
            user.setCash(user.getCash() - cash);
            return save(user);
        } else {
            // todo: подумать
            return null;
        }
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
