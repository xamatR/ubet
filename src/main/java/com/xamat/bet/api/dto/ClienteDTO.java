package com.xamat.bet.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import com.xamat.bet.api.model.Pessoa;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
    private Long id;
    private String nome;
    private String email;


    public static ClienteDTO from(Pessoa pessoa) {
        ModelMapper modelMapper = new ModelMapper();
        ClienteDTO dto = modelMapper.map(pessoa, ClienteDTO.class);
        dto.nome = pessoa.getNome();
        dto.email = pessoa.getEmail();
        return dto;    
    }
}
