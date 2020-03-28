package com.exam7.dishorder.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.UUID;

@Document("dishes")
@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
public class Dish {

    @Id
    @Builder.Default
    private String id = UUID.randomUUID().toString();
    private String name;
    private String description;
    @DBRef
    private Place place;
    private int price;
}
