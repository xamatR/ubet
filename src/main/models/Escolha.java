package models;

import java.util.List;

import org.springframework.cglib.core.Local;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Escolha {
    @Id
    @GenerationType(strategy = GenerationType.Se)
    private Long id;
    private String status;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    @ManyToMany(mappedBy = "escolhas")
    private List<eventos> eventos;

    @JsonIgnore
    @OneToMany(mappedBy = "escolha")
    private List<Odd> odds;
}
