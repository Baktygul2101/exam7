package com.exam7.dishorder.repository;



import com.exam7.dishorder.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface OrderRepo extends CrudRepository<Order, String>{
    public List<Order> findByDish(String id);
}