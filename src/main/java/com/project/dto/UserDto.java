package com.project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {

    private Integer ig;
    private String name;
    private String pass;
    private Double cash;

    @Override
    public String toString() {
        return "User " + ig +
                ", name= " + name +
                ", pass= " + pass +
                ", cash= " + cash;
    }
}