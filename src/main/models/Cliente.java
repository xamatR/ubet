package models;

import java.util.List;

public class Cliente extends Pessoa{

    @id @Unique
    private String cpf;
    private float saldo;
    private String ddd;
    private String telefone;

    @OneToMany
    private List<InfoBancaria> infoBancaria;

    @OneToMany
    private List<Aposta> apostas;
}
