package com.example.cinemaspring.controllers;


import com.example.cinemaspring.models.Film;
import com.example.cinemaspring.models.Salle;
import com.example.cinemaspring.services.impl.SalleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("salles")
public class SalleController {

    @Autowired
    private SalleServiceImpl service;

    @GetMapping
    public List<Salle> findAll() {

        return service.findAll();
    }

    @PostMapping
    public Salle save(@RequestBody Salle salle) {

        return service.save(salle);
    }



}
