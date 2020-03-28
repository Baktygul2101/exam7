package com.exam7.dishorder.repository;
import com.exam7.dishorder.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface ClientRepo extends CrudRepository<Client, String>{

    Optional<Client> findByClientName(String s);
}