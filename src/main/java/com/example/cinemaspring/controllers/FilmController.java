package com.example.cinemaspring.controllers;

import com.example.cinemaspring.models.Film;
import com.example.cinemaspring.services.impl.FilmServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("films")
public class FilmController {

    @Autowired
    private FilmServiceImpl service;

    @GetMapping
    public List<Film> findAll() {
        return service.findAll();
    }


    @PostMapping
    public Film save(@RequestBody Film film) {
        return service.save(film);
    }



}
