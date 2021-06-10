package com.example.cinemaspring.services.impl;

import com.example.cinemaspring.models.Cinema;

import org.springframework.data.mongodb.repository.MongoRepository;

public class CinemaServiceImpl extends GenericServiceImpl<Cinema>{



    public CinemaServiceImpl(MongoRepository<Cinema, String> repository) {

        super(repository);
    }
}
