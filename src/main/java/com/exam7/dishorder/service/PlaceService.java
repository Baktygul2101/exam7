package com.exam7.dishorder.service;


import com.exam7.dishorder.dto.PlaceDTO;
import com.exam7.dishorder.model.Place;
import com.exam7.dishorder.repository.PlaceRepo;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlaceService {
    private final PlaceRepo placeRepo;

    public PlaceService(PlaceRepo placeRepo) {
        this.placeRepo = placeRepo;
    }

       public List<Place> getPlaceList() {
        List<Place> result = new ArrayList<>();
        placeRepo.findAll().forEach(result::add);
        return result;
    }

}
