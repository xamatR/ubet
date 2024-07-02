package com.xamat.bet.api.dto;

import org.modelmapper.ModelMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.xamat.bet.models.Aposta;

@Data
@NoArgsConstructor
public class ApostaDTO {
    private Long id;
    private LocalDateTime data;
    private float valor;
    private String status;

    public static ApostaDTO create(Aposta aposta) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(aposta, ApostaDTO.class);
    }
}