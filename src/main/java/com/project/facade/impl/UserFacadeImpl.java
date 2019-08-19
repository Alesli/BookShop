package com.project.facade.impl;

import com.project.converter.UserConverter;
import com.project.dto.UserBookDto;
import com.project.dto.UserDto;
import com.project.entity.User;
import com.project.facade.UserFacade;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserFacadeImpl implements UserFacade {

    @Autowired
    private UserService userService;

    @Override
    public UserDto findOne(Integer id) {
        User user = userService.findOne(id);
        return UserConverter.getUserDto(user);
    }

    @Override
    public UserDto findOneByPass(String pass) {
        User user = userService.findOneByPass(pass);
        return UserConverter.getUserDto(user);
    }

    @Override
    public UserDto findUserByIdAndName(Integer id, String name) {
        User user = userService.findUserByIdAndName(id, name);
        return UserConverter.getUserDto(user);
    }

    @Override
    public List<UserDto> findAll() {
        List<User> userList = userService.findAll();
        List<UserDto> userDtoList = new ArrayList<>(userList.size());
        for (User user : userList) {
            userDtoList.add(UserConverter.getUserDto(user));
        }
        return userDtoList;
    }

    @Override
    public UserBookDto addBookToUser(UserBookDto userBookDto) {
        User user = UserConverter.getUser(userBookDto);

        return null;
    }

    @Override
    public void deleteBookToUser(Integer userId, Integer bookId) {

    }
}
