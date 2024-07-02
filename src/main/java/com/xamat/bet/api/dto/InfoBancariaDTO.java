package com.xamat.bet.api.dto;

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
