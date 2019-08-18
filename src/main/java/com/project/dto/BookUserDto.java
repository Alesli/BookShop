package com.project.dto;

import com.project.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookUserDto {

    private Integer id;
    private String name;
    private String author;
    private String description;
    private Double cost;
    private List<UserDto> userDtoList;

    @Override
    public String toString() {

        StringBuilder u = new StringBuilder();
        for (UserDto userDto : userDtoList) {
            u.append("\t").append(userDto).append("\n");
        }
        return "BookUser " + id +
                ", name= " + name +
                ", author= " + author +
                ", description= " + description +
                ", cost= " + cost +
                ", users= " + u.toString();
    }
}
