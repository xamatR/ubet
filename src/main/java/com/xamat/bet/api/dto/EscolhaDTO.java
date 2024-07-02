package com.xamat.bet.api.dto;

import com.xamat.bet.models.Escolha;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EscolhaDTO {
    private long id;
    private String status;
    private LocalDate dataInicio;
    private LocalDate dataFim;


    public static EscolhaDTO from(Escolha escolha) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(pessoa, EscolhaDTO.class);
    }
    
}
