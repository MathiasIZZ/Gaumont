package com.example.cinemaspring.services.impl;

import com.example.cinemaspring.models.Salle;
import org.springframework.data.mongodb.repository.MongoRepository;

public class SalleServiceImpl extends GenericServiceImpl<Salle>{


    public SalleServiceImpl(MongoRepository repository) {
        super(repository);
    }
}
