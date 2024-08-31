package com.xamat.bet.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

public class Aposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private LocalDateTime data;
    private float valor;
    private String status;

    @ManyToOne
    private Cliente cliente;
    
}
