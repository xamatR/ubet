package com.xamat.bet.api.dto;

import com.xamat.bet.models.Cliente;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
    private Long id;
    private String nome;
    private String email;


    public static ClienteDTO from(Cliente pessoa) {
        ModelMapper modelMapper = new ModelMapper();
        ClienteDTO dto = modelMapper.map(pessoa, ClienteDTO.class);
        dto.nome = pessoa.getNome();
        dto.email = pessoa.getEmail();
        return dto;    
    }
}
