package com.exam7.dishorder.repository;



import com.exam7.dishorder.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OrderRepo extends CrudRepository<Order, String>{

}