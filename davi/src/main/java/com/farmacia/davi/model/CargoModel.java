package com.farmacia.davi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table (name = "TBCARGO")
public class CargoModel {

    @Id@GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "cd_cargo")
    private Integer cdCargo;
    @Column (name = "ds_nome_Cargo")
    private String nomeCargo;
    @Column (name = "ds_cargo")
    private String dsCargo;





}
