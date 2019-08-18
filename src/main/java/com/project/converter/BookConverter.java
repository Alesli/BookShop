package com.project.converter;

import com.project.dto.BookUserDto;
import com.project.dto.BookDto;
import com.project.dto.UserDto;
import com.project.entity.Book;
import com.project.entity.User;

import java.util.ArrayList;
import java.util.List;

public class BookConverter {

    public static BookDto getBookDTO(Book book) {

        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setName(book.getName());
        bookDto.setAuthor(book.getAuthor());
        bookDto.setDescription(book.getDescription());
        bookDto.setCost(book.getCost());
        return bookDto;
    }

    public static BookUserDto getBookAuthorDto(Book book) {

        BookUserDto bookUserDto = new BookUserDto();
        bookUserDto.setId(book.getId());
        bookUserDto.setName(book.getName());
        bookUserDto.setAuthor(book.getAuthor());
        bookUserDto.setDescription(book.getDescription());
        bookUserDto.setCost(book.getCost());


        List<User> userList = book.getUsers();
        List<UserDto> userDtoList = new ArrayList<>(userList.size());
        for (User user : userList) {
            userDtoList.add(UserConverter.getUserDto(user));
        }
        bookUserDto.setUserDtoList(userDtoList);
        return bookUserDto;
    }
}
