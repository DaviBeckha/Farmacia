package com.farmacia.davi.dto;

import jakarta.validation.constraints.*;

public record EmpresaDto(

        @NotNull (message = "Nome da empresa não pode ser vazio")
        @Size(min = 3, max = 100, message = "Nome da empresa não pode ser menor que 3 e maior que 100")
        String nomeEmpresa,

        @NotNull (message = "Cidade da empresa não pode ser vazio")
        @Size(min = 3, max = 100, message = "Cidade da empresa não pode ser menor que 3 e maior que 100")
        String cidadeEmpresa,

        @NotNull (message = "Precisa preencher o CPNJ")
        @Pattern(regexp="\\d{14}")
        String cnpj,

        @NotBlank(message = "Precisa preencher o telefone")
        String telefone,


        @Email
        String email

) {
}
