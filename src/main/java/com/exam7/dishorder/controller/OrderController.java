package com.exam7.dishorder.controller;



import com.exam7.dishorder.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/clients")
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;


}
