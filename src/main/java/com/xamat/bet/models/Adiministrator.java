package com.xamat.bet.models;

import jakarta.persistence.ManyToOne;
import models.Pessoa;

public class Adiministrator extends Pessoa{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    

}
