package models;

import models.Pessoa;

public class adiministrator extends Pessoa{    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OnetoMany
    List<evento> eventos;
}
