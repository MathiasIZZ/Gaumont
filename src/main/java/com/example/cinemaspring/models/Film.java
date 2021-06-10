package com.example.cinemaspring.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
@Data
public class Film {

    @Id
    private String id;

    private String nom;
    private int duree;




}
