package com.farmacia.davi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "TBCLIENTES")
public class ClienteModel {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_Cliente")
    private Integer cdCliente;
    @Column(name = "ds_nome_Cliente")
    private String nomeCliente;
    @Column(name = "ds_cpf_Cliente")
    private String cpfCliente;
    @Column(name = "num_telefone_Cliente")
    private String telefone;
    @Column(name = "ds_email_Cliente")
    private String emailCliente;

}
