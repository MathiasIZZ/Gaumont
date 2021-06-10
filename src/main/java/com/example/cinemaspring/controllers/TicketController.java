package com.example.cinemaspring.controllers;


import com.example.cinemaspring.services.impl.SeanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("tickets")
public class TicketController {

    @Autowired
    private SeanceServiceImpl service;




}
