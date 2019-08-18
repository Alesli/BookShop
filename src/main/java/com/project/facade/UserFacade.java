package com.project.facade;

import com.project.dto.UserDto;

import java.util.List;

public interface UserFacade {

    UserDto findOne(Integer id);

    UserDto findOneByPass(String pass);

    List<UserDto> findAll();
}
