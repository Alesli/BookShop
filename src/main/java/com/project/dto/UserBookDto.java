package com.project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserBookDto {

    private Integer ig;
    private String name;
    private String pass;
    private Double cash;
    private List<BookDto> bookDtoList;

    @Override
    public String toString() {

        StringBuilder b = new StringBuilder();
        for (BookDto book : bookDtoList) {
            b.append("\t").append(book).append("\n");
        }
        return "UserBook " + ig +
                ", name= " + name +
                ", pass= " + pass +
                ", cash= " + cash +
                ", books= " + b.toString();
    }
}