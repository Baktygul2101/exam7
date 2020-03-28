package com.exam7.dishorder.service;





import com.exam7.dishorder.model.Dish;
import com.exam7.dishorder.repository.DishRepo;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DishService {
    private final DishRepo dishRepo;

    public List<Dish> getDishList() {
        List<Dish> result = new ArrayList<>();
        dishRepo.findAll().forEach(result::add);
        return result;
    }
}