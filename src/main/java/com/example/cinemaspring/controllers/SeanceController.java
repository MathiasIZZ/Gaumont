package com.example.cinemaspring.controllers;


import com.example.cinemaspring.models.Seance;
import com.example.cinemaspring.services.impl.SeanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("seances")
public class SeanceController {

    @Autowired
    private SeanceServiceImpl service;

    @GetMapping
    public List<Seance> findAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public Seance findById(@PathVariable String id) {

        return service.findById(id);
    }

    @PostMapping
    public Seance save(@RequestBody Seance seance) {

        return service.save(seance);
    }





}
