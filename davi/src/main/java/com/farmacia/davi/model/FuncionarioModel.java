package com.farmacia.davi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table (name = "TBFUNCIONARIOS")
public class FuncionarioModel {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "cd_Funcionario")
    private Integer cdfuncionario;
    @Column (name = "nome_Funcionario")
    private String nomeFuncionario;
    @Column (name = "cpf_Funcionario")
    private String cpfFuncionario;
    @Column (name = "email_Funcionario")
    private String emailFuncionario;
    @Column (name = "salario")
    private Double salario;
    @Column (name = "cargo")
    private String cargo;
    @Column (name = "codigo_cargo")
    private Integer cdCargo;

}
