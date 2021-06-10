package com.example.cinemaspring.config;

import com.example.cinemaspring.repositories.ICinemaRepository;
import com.example.cinemaspring.repositories.IFilmRepository;
import com.example.cinemaspring.repositories.ISalleRepository;
import com.example.cinemaspring.repositories.ISeanceRepository;
import com.example.cinemaspring.services.impl.CinemaServiceImpl;
import com.example.cinemaspring.services.impl.FilmServiceImpl;
import com.example.cinemaspring.services.impl.SalleServiceImpl;
import com.example.cinemaspring.services.impl.SeanceServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public FilmServiceImpl filmServiceFactory(IFilmRepository repository) {

        return new FilmServiceImpl(repository);
    }

    @Bean
    public SeanceServiceImpl seanceServiceFactory(ISeanceRepository repository) {

        return new SeanceServiceImpl(repository);
    }

    @Bean
    public SalleServiceImpl salleServiceFactory(ISalleRepository repository) {

        return new SalleServiceImpl(repository);
    }

    @Bean
    public CinemaServiceImpl cinemaServiceFactory(ICinemaRepository repository) {
        return new CinemaServiceImpl(repository);
    }






}
