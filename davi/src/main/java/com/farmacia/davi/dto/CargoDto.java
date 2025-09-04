package com.farmacia.davi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CargoDto(

        @NotBlank(message = "Nome do cargo não pode estar vazio")
        @Size(min = 2 , max = 200, message = "Nome do cargo não pode ser menor que 2 e maior que 200")
        String nomeCargo
) {
}
