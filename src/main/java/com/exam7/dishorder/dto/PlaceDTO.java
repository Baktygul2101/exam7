package com.exam7.dishorder.dto;


import com.exam7.dishorder.model.Place;
import lombok.*;

@Data
@Builder
public class PlaceDTO {

    public static PlaceDTO from(Place place) {
        return builder()
                .id(place.getId())
                .name(place.getName())
                .description(place.getDescription())
                .build();
    }

    private String id;
    private String name;
    private String description;
}
