package com.xamat.bet.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import com.xamat.bet.api.model.Pessoa;

import org.modelmapper.ModelMapper;

import com.xamat.bet.api.model.adiministrator;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdiministradorDTO {
    private Long id;
    private String nome;
    private String email;

    public static AdiministradorDTO from(Pessoa pessoa) {
        ModelMapper modelMapper = new ModelMapper();
        AdiministradorDTO dto = modelMapper.map(pessoa, AdiministradorDTO.class);
        dto.nome = pessoa.getNome();
        dto.email = pessoa.getEmail();
                
        return dto;    
    }
}
