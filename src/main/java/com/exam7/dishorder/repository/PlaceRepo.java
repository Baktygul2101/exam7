package com.exam7.dishorder.repository;

import com.exam7.dishorder.model.Place;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PlaceRepo extends CrudRepository<Place, String>{

    public Page<Place> findAllBy(Pageable pageable);
}