package com.exam7.dishorder.controller;


import com.exam7.dishorder.service.DishService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/dishes")
@AllArgsConstructor
public class DishController {

    private final DishService dishService;


}
