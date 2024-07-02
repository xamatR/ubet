package models;

import jakarta.persistence.ManyToOne;
import models.Pessoa;

public class adiministrator extends Pessoa{    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    List<evento> eventos;
}
