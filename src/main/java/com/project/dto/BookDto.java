package com.project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookDto {

    private Long id;
    private String name;
    private String author;
    private String description;
    private Double cost;
    private Integer count;

    @Override
    public String toString() {
        return "Book " + id +
                ", name= " + name +
                ", author= " + author +
                ", description= " + description +
                ", cost= " + cost +
                ", count= " + count;
    }
}

