package com.xamat.bet.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;

import com.xamat.bet.models.Evento;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventoDTO {
    private Long id;
    private String titulo;
    private String descricao;
   
    public static EventoDTO from(Evento evento) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(evento, EventoDTO.class);
    }
    
}
