package com.farmacia.davi.dto;

import jakarta.validation.constraints.*;

public record FuncionarioDto(

        @NotBlank (message = "Nome do funcinário não pode ser nulo")
        @Size (min = 2 , max = 200)
        String nomeFuncionario,

        @NotBlank (message = "CPF obrigatório do funcionário para cadastro na empresa")
        @Pattern (regexp="\\d{11}")
        String cpfFuncionario,

        @Email
        String emailFuncionario,

        @NotNull (message = "Valor não pode ser nulo")
        Double salario,

        @NotBlank (message = "Cargo precisa ser preenchido.")
        String cargo,

        @NotNull (message = "Código do cargo precisa ser preenchido")
        Integer cdCargo
) {
}
