package com.project.controller;

import com.project.dto.UserDto;
import com.project.entity.User;
import com.project.facade.UserFacade;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserFacade userFacade;

    /*
     * http://localhost:8080/api/user/get/by/id/1
     */
    @GetMapping("/get/by/id/{userId}")
    public ResponseEntity<UserDto> findOneById(@PathVariable("userId") Integer userId) {
        UserDto result = userFacade.findOne(userId);
        if (result == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(result, HttpStatus.OK);
        }
    }

    /*
     * http://localhost:8080/api/user/get/all
     */
    @GetMapping("/get/all")
    public ResponseEntity<List<UserDto>> findAll() {
        List<UserDto> result = userFacade.findAll();
        if (result.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(result, HttpStatus.OK);
        }
    }
}
