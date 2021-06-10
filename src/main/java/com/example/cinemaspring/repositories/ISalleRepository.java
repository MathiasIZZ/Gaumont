package com.example.cinemaspring.repositories;

import com.example.cinemaspring.models.Salle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ISalleRepository extends MongoRepository<Salle, String> {




}
