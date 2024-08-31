package com.xamat.bet.models;

import jakarta.persistence.ManyToOne;

public class Odds {
    @Id
    private Long id;

    private float multiplicador;
    private String tipo;
    private String nome;
    private String resultado;

    @ManyToOne
    private Escolha escolha;
}
