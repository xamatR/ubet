package com.xamat.bet.api.dto;

import org.modelmapper.ModelMapper;

public class OddsDTO {
    private Long id;
    private float multiplicador;
    private String tipo;
    private String nome;
    private String resultado;

    public static OddsDTO from(OddsDTO oddsDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(oddsDTO, OddsDTO.class);
    }
}
