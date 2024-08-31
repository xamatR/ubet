package com.xamat.bet.models;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class InfoBancaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String agencia;
    private String conta;
    private String banco;
    private String tipoConta;

    @ManyToOne
    private Cliente cliente;
}
