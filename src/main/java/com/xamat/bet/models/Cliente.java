package com.xamat.bet.models;

import java.util.List;

public class Cliente extends Pessoa{

    @id @Unique
    private String cpf;
    private float saldo;
    private String ddd;
    private String telefone;

}
