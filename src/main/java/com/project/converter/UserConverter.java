package com.project.converter;

import com.project.dto.BookDto;
import com.project.dto.UserBookDto;
import com.project.dto.UserDto;
import com.project.entity.Book;
import com.project.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserConverter {

    public static UserDto getUserDto(User user) {

        UserDto userDto = new UserDto();
        userDto.setIg(user.getId());
        userDto.setName(user.getName());
        userDto.setPass(user.getPass());
        userDto.setCash(user.getCash());
        return userDto;
    }

    public static User getUser(UserBookDto userBookDto) {

        User user = new User();
        user.setId(userBookDto.getId());
        user.setName(userBookDto.getName());
        user.setPass(userBookDto.getPass());
        user.setCash(userBookDto.getCash());
        return user;
    }

    public static UserBookDto getUserBookDto(User user){

        UserBookDto userBookDto = new UserBookDto();
        userBookDto.setId(user.getId());
        userBookDto.setName(user.getName());
        userBookDto.setPass(user.getPass());
        userBookDto.setCash(user.getCash());

        List<Book> bookList = user.getBooks();
        List<BookDto> bookDtoList = new ArrayList<>(bookList.size());
        for (Book book : bookList) {
            bookDtoList.add(BookConverter.getBookDTO(book));
        }
        userBookDto.setBookDtoList(bookDtoList);
        return userBookDto;
    }
}
