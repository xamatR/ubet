package com.xamat.bet.models;

import java.util.List;

import org.springframework.cglib.core.Local;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Escolha {
    @Id
    @GenerationType(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String status;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    @ManyToOne
    private Evento evento;

    @OneToOne
    private Aposta aposta;

}
