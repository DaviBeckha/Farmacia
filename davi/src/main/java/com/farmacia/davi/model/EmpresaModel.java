package com.farmacia.davi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table (name = "TBEMPRESA",
uniqueConstraints = {
        @UniqueConstraint(columnNames = {"nome_empresa"}),
        @UniqueConstraint(columnNames = {"num_cnpj"}),
        @UniqueConstraint(columnNames = {"ds_email"})
}
)   // Vai deixar cada um somente tendo 1 e não deixando replicar no banco
    //https://stackoverflow.com/questions/3126769/uniqueconstraint-annotation-in-java

public class EmpresaModel {

    @Id@GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "cd_empresa")
    private Integer cdEmpresa;
    @Column (name = "nome_Empresa")
    private String nomeEmpresa;
    private String cidadeEmpresa;
    @Column (name = "num_cnpj")
    private String cnpj;
    @Column (name = "num_telefone")
    private String telefone;
    @Column (name = "ds_email")
    private String email;
}
