package com.farmacia.davi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record ClienteDto(
        @NotBlank (message = "Não pode deixar nome do cliente nulo")
        @Size (min = 2, max = 200)
        String nomeCliente,

        @Pattern (regexp="\\d{11}")
        String cpfCliente,

        @Size(min = 9, max = 13)
        @NotBlank (message = "Não pode deixar o cliente sem cadastro de telefone")
        String telefone,

        @Email
        String emailCliente
) {
}
