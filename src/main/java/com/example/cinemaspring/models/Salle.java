package com.example.cinemaspring.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Salle {

    @Id
    private String id;


    private int numero;
    private int nbPlacesAssises;

    @DBRef
    private Cinema cinema;



}
