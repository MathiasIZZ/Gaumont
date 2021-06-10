package com.example.cinemaspring.repositories;

import com.example.cinemaspring.models.Film;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IFilmRepository extends MongoRepository<Film, String> {




}
