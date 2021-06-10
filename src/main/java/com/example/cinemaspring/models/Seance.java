package com.example.cinemaspring.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document
@Data
public class Seance {

    @Id
    private String id;

    private LocalDateTime date_debut;
    private LocalDateTime date_fin;


    @DBRef
    private Film film;
    @DBRef
    private Salle salle;





}
