package com.exam7.dishorder.repository;



import com.exam7.dishorder.model.Dish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DishRepo extends CrudRepository<Dish, String>{

}