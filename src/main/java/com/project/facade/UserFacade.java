package com.project.facade;

import com.project.dto.UserBookDto;
import com.project.dto.UserDto;
import com.project.entity.User;

import java.util.List;

public interface UserFacade {

    UserDto findOne(Integer id);

    UserDto findOneByPass(String pass);

    UserDto findUserByIdAndName(Integer id, String name);

    List<UserDto> findAll();

    UserBookDto addBookToUser(UserBookDto userBookDto);

    void deleteBookToUser(Integer userId, Integer bookId);
}
