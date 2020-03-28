package com.exam7.dishorder.dto;


import com.exam7.dishorder.model.Client;
import com.exam7.dishorder.model.Order;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Data
@Builder
public class OrderDTO {

    public static OrderDTO from(Order order) {
        return builder()
                .id(order.getId())
                .client(order.getClient())
                .dish(DishDTO.from(order.getDish()))
                .orderDate(order.getOrderDate().format(DateTimeFormatter.ISO_DATE_TIME))
                .build();
    }


    private String id;
    private Client client;
    private DishDTO dish;
    private String orderDate;
}
