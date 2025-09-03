package com.farmacia.davi.repository;

import com.farmacia.davi.model.CargoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CargoRepository extends JpaRepository <CargoModel, Integer> {
    Optional<CargoModel> findByCdCargo (Integer cdCargo);


}
