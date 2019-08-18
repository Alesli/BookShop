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
public class BookShopDto {

    private Integer id;
    private String name;
    private String author;
    private String description;
    private Double cost;
    private List<ShopDto> shopDtoList;

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        for (ShopDto shopDto : shopDtoList) {
            s.append("\t").append(shopDto).append("\n");
        }
        return "BookShop " + id +
                ", name= " + name +
                ", author= " + author +
                ", description= " + description +
                ", cost= " + cost +
                ", shops= " + s.toString();
    }
}
