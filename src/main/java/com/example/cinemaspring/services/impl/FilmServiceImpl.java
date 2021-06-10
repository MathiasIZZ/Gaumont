package com.example.cinemaspring.services.impl;

import com.example.cinemaspring.models.Film;
import org.springframework.data.mongodb.repository.MongoRepository;

public class FilmServiceImpl extends GenericServiceImpl<Film>{


    public FilmServiceImpl(MongoRepository repository) {

        super(repository);
    }
}
