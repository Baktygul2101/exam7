package com.exam7.dishorder.dto;


import com.exam7.dishorder.model.Dish;
import lombok.*;

@Data
@Builder
public class DishDTO {

    public static DishDTO from(Dish dish) {
        return builder()
                .id(dish.getId())
                .name(dish.getName())
                .description(dish.getDescription())
                .place(PlaceDTO.from(dish.getPlace()))
                .price(dish.getPrice())
                .build();
    }

    private String id;
    private String name;
    private String description;
    private PlaceDTO place;
    private int price;
}
