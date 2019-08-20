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

    private Long id;
    private String name;
    private Double cash;

    @Override
    public String toString() {
        return "Shop " + id +
                ", name= " + name +
                ", cash= " + cash;
    }
}
