package com.farmacia.davi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor




@Entity
@Table (name = "TBFUNCIONARIOS",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"cpf_funcionario"}),
        @UniqueConstraint(columnNames = {"email_funcionario"})
    }
)

public class FuncionarioModel {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "cd_Funcionario")
    private Integer cdFuncionario;
    @Column (name = "nome_Funcionario")
    private String nomeFuncionario;
    @Column (name = "cpf_Funcionario")
    private String cpfFuncionario;
    @Column (name = "email_Funcionario")
    private String emailFuncionario;
    @Column (name = "num_salario")
    private Double salario;
    @Column (name = "ds_cargo")
    private String cargo;
    @Column (name = "cd_cargo")
    private Integer cdCargo;

}
