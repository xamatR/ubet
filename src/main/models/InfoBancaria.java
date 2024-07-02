package models;

import jakarta.persistence.Id;

public class InfoBancaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String agencia;
    private String conta;
    private String banco;
    private String tipoConta;
}
