package models;

import java.util.List;

import org.springframework.cglib.core.Local;

public class Escolha {
    @Id
    @GenerationType(strategy = GenerationType.Se)
    private Long id;
    private String status;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    private List<eventos> eventos;
    private List<Odd> odds;
}
