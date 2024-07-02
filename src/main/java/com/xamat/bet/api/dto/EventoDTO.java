package com.xamat.bet.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import com.xamat.bet.api.model.Pessoa;
import org.m

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventoDTO {
    private Long id;
    private String nome;
    private String descricao;
    private String data;
    private String hora;
    private String local;
    private String status;

    public static EventoDTO from(Pessoa pessoa) {
        EventoDTO dto = new EventoDTO();
        dto.id = pessoa.getId();
        dto.nome = pessoa.getNome();
        dto.descricao = pessoa.getDescricao();
        dto.data = pessoa.getData();
        dto.hora = pessoa.getHora();
        dto.local = pessoa.getLocal();
        dto.status = pessoa.getStatus();
        return dto;    
    }
    
}
