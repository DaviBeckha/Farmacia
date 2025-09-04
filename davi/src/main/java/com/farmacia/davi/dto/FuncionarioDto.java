package com.farmacia.davi.dto;

import jakarta.validation.constraints.*;

public record FuncionarioDto(

        @NotBlank (message = "Nome do funcinário não pode ser vazio")
        @Size (min = 2 , max = 100, message = "Nome do funcionário deve ser maior que 2 caracteres e menor que 100")
        String nomeFuncionario,

        @NotBlank (message = "CPF obrigatório do funcionário para cadastro na empresa")
        @Pattern (regexp="\\d{11}")
        String cpfFuncionario,

        @Email
        String emailFuncionario,

        @DecimalMin(value = "1514", message = "Salário por lei brasileira não deve ser menor que 1514 ")
        Double salario,

        @NotBlank (message = "Cargo precisa ser preenchido.")
        String cargo,

        @NotNull (message = "Código do cargo precisa ser preenchido")
        Integer cdCargo
) {
}
