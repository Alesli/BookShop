package com.project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ShopDto {

    private Integer id;
    private String name;
    private String cash;

    @Override
    public String toString() {
        return "Shop " + id +
                ", name= " + name +
                ", cash= " + cash;
    }
}
