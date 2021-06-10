package com.example.cinemaspring.repositories;

import com.example.cinemaspring.models.Seance;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ISeanceRepository extends MongoRepository<Seance, String> {
}
