package com.example.cinemaspring.repositories;

import com.example.cinemaspring.models.Cinema;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICinemaRepository extends MongoRepository<Cinema, String> {



}
