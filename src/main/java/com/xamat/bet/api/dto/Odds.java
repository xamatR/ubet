package com.xamat.bet.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import com.xamat.bet.api.model.Pessoa;
import org.modelmapper.ModelMapper;

import com.xamat.bet.api.model.Odds;

public class Odds {
    private Long id;
    private float multiplicador;
    private String tipo;
    private String nome;
    private String resultado;

    public static Odds from(Odds odds) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(odds, Odds.class);
    }
}
