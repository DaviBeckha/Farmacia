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
    @Column(name = "nome_Cliente")
    private String nomeCliente;
    @Column(name = "cpf_Cliente")
    private String cpfCliente;
    @Column(name = "telefone_Cliente")
    private String telefone;
    @Column(name = "email_Cliente")
    private String emailCliente;

}
