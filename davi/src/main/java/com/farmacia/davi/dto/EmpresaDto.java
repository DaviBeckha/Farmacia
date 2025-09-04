package com.farmacia.davi.dto;

import jakarta.validation.constraints.*;

public record EmpresaDto(

        @NotNull (message = "Nome da empresa não pode ser nulo")
        @Size(min = 3, max = 300, message = "Nome da empresa não pode ser menor que 3 e maior que 300")
        String nomeEmpresa,

        @NotNull (message = "Precisa preencher o CPNJ")
        @Pattern(regexp="\\d{14}")
        String cnpj,

        @NotBlank(message = "Precisa preencher o telefone")
        String telefone,

        @Email
        String email

) {
}
