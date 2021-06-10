package com.example.cinemaspring.services.impl;

import com.example.cinemaspring.models.Seance;
import org.springframework.data.mongodb.repository.MongoRepository;

public class SeanceServiceImpl extends GenericServiceImpl<Seance> {


    public SeanceServiceImpl(MongoRepository<Seance, String> repository) {

        super(repository);
    }



}
