package com.example.cinemaspring.controllers;

import com.example.cinemaspring.models.Cinema;
import com.example.cinemaspring.services.impl.CinemaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("cinemas")
public class CinemaController {

    @Autowired
    private CinemaServiceImpl service;

    @GetMapping
    public List<Cinema> findAll() {

        return service.findAll();
    }

    @PostMapping
    public Cinema save(@RequestBody Cinema cinema) {
        return service.save(cinema);
    }





}
