package com.farmacia.davi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Cleanup;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table (name = "TBEMPRESA")
public class EmpresaModel {

    @Id@GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "cd_empresa")
    private Integer cdEmpresa;
    @Column (name = "nome_Empresa")
    private String nomeEmpresa;
    @Column (name = "cpnj")
    private String cpnj;
    @Column (name = "telefone")
    private String telefone;
    @Column (name = "email")
    private String email;
}
