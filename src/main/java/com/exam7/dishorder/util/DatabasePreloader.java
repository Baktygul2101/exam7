package com.exam7.dishorder.util;


import com.exam7.dishorder.model.Client;
import com.exam7.dishorder.model.Dish;
import com.exam7.dishorder.model.Order;
import com.exam7.dishorder.model.Place;
import com.exam7.dishorder.repository.ClientRepo;

import com.exam7.dishorder.repository.DishRepo;
import com.exam7.dishorder.repository.OrderRepo;
import com.exam7.dishorder.repository.PlaceRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

@Configuration
public class DatabasePreloader {
    private static final Random random = new Random();

    @Bean
    CommandLineRunner initDatabase(ClientRepo clientRepo, OrderRepo orderRepo, PlaceRepo placeRepo, DishRepo dishRepo) {
        return (args) -> {
            clientRepo.deleteAll();
            orderRepo.deleteAll();
            placeRepo.deleteAll();
            dishRepo.deleteAll();


            List<Client> clientList = new ArrayList<>();
            clientList.add(new Client("1", "Homer Skoog ","dsgs", "dgs"));
            clientList.add(new Client("2", "", "fjfjf", "hyh"));
            clientRepo.saveAll(clientList);

            List<Place> placeList = new ArrayList<>();
            placeList.add(new Place("1","Ashkana","stolovaya" ));
            placeList.add(new Place("2", "City Lunch", "GUM 5 floor"));
            placeRepo.saveAll(placeList);


            List<Dish> dishList = new ArrayList<>();
            dishList.add(new Dish("1","lagman","dungans", placeList.get(2),100));
            dishList.add(new Dish("2", "Chicken", "tasty", placeList.get(1), 130));
            dishRepo.saveAll(dishList);

            List<Order> orderList = new ArrayList<>();
            orderList.add(new Order("1",clientList.get(1),dishList.get(1), null));
            orderList.add(new Order("2",clientList.get(2),dishList.get(2), null));
            orderRepo.saveAll(orderList);

        };
    }
}




