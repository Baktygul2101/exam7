package com.exam7.dishorder.controller;





import com.exam7.dishorder.model.Place;
import com.exam7.dishorder.repository.PlaceRepo;
import com.exam7.dishorder.service.DishService;
import com.exam7.dishorder.service.PlaceService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/places")
@AllArgsConstructor
public class PlaceController {

    private final PlaceService placeService;
    private final DishService dishService;
    private final PlaceRepo placeRepo;

    @GetMapping("/")
    public List<Place> getAllPlaces() {
        return placeService.getPlaceList();
    }

    @GetMapping("/s")
    public Page<Place> getPlacePage() {
        Sort sortBy = Sort.by(Sort.Order.asc("name"));
        int page = 1;
        int count = 3;
        Pageable pageable = PageRequest.of(page, count, sortBy);
        return placeRepo.findAllBy(pageable);
    }

}
