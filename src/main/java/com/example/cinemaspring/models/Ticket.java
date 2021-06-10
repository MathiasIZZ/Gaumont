package com.example.cinemaspring.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Ticket {

    @Id
    private String id;

    @DBRef
    private Seance seance;


}
