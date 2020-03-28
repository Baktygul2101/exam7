package com.exam7.dishorder.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.UUID;

@Document("places")
@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Place {

    @Id
    @Builder.Default
    private String id = UUID.randomUUID().toString();
    private String name;
    private String description;

 }
