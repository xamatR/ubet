package models;

import jakarta.persistence.OneToMany;

public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;

    @OneToMany
    private List<Escolha> escolhas;
}