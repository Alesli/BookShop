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
public class ShopBookDto {

    private Integer id;
    private String name;
    private Double cash;
    private List<BookDto> bookDtoList;

    @Override
    public String toString() {

        StringBuilder b = new StringBuilder();
        for (BookDto book : bookDtoList) {
            b.append("\t").append(book).append("\n");
        }
        return "ShopBook " + id +
                ", name= " + name +
                ", cash= " + cash +
                ", books " + b.toString();
    }
}
