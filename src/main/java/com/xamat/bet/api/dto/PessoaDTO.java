package com.xamat.bet.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import com.xamat.bet.api.model.Pessoa;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {
    private Long id;
    private String nome;
    private String email;
    private String senha;

    public static PessoaDTO from(Pessoa pessoa) {
        ModelMapper modelMapper = new ModelMapper();
        PessoaDTO dto = modelMapper.map(pessoa, PessoaDTO.class);
        dto.nome = pessoa.getNome();
        dto.email = pessoa.getEmail();
        dto.senha = pessoa.getSenha();
        return dto;    
    }

}
