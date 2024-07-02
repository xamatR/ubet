package com.xamat.bet.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import com.xamat.bet.api.model.Pessoa;

import ch.qos.logback.core.model.Model;

import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdiministradorDTO {
    private Long id;
    private String nome;
    private String email;
    private String senha;

    public static AdiministradorDTO from(Pessoa pessoa) {
        ModelMapper modelMapper = new ModelMapper();
        AdiministradorDTO dto = modelMapper.map(pessoa, AdiministradorDTO.class);
        dto.nome = pessoa.getNome();
        dto.email = pessoa.getEmail();
        
        return dto;    
    }
}
