package com.farmacia.davi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "TBPRODUTOS")
public class ProdutoModel {


    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_Produto")
    private Integer cdProduto;
    @Column(name = "nome_Produto")
    private String nmProduto;
    @Column(name = "descricao_bula")
    private String dsBula;
    @Column(name = "valor_produto")
    private double vlProduto;

}
