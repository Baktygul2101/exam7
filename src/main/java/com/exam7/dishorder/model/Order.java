package com.exam7.dishorder.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Document("orders")
@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
public class Order {

    @Id
    @Builder.Default
    private String id = UUID.randomUUID().toString();
    @DBRef
    private Client client;
    @DBRef
    private Dish dish;
    private LocalDateTime orderDate;
}
