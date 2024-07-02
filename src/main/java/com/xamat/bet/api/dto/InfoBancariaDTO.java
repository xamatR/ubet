package com.xamat.bet.api.dto;

import org.modelmapper.ModelMapper;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import com.xamat.bet.models.InfoBancaria;

public class InfoBancariaDTO {

    private Long id;

    private String agencia;
    private String conta;
    private String banco;
    private String tipoConta;

    public static InfoBancariaDTO create(InfoBancaria infoBancaria) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(infoBancaria, InfoBancariaDTO.class);
    }
}
