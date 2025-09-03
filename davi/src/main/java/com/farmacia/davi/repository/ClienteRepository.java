package com.farmacia.davi.repository;

import com.farmacia.davi.model.ClienteModel;
import com.farmacia.davi.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {
    Optional<ClienteModel> findByCdClientes (Integer cdCliente);
    Optional<ClienteModel> findAllByCdClientes(Integer cdCliente);
}
