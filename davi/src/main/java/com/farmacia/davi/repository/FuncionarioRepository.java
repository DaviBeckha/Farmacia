package com.farmacia.davi.repository;

import com.farmacia.davi.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository <FuncionarioModel, Integer> {
    Optional<FuncionarioModel> findByCdFuncionario (Integer cdFuncionario);
    Optional<FuncionarioModel> findByAllCdFuncionario (Integer cdFuncionario);
}
