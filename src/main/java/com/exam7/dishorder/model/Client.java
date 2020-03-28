package com.exam7.dishorder.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Collection;
import java.util.UUID;

@Document("clients")
@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Client  {
    @Id
    @Builder.Default
    private String id = UUID.randomUUID().toString();
    private String clientName;
    private String email;
    private String password;


}
