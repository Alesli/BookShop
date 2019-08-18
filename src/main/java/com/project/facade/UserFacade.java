package com.project.facade;

import com.project.dto.UserDto;
import com.project.entity.User;

import java.util.List;

public interface UserFacade {

    UserDto findOne(Integer id);

    UserDto findOneByPass(String pass);

    List<UserDto> findAll();
}
