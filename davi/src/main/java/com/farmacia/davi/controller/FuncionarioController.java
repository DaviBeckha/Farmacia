package com.farmacia.davi.controller;


import com.farmacia.davi.dto.FuncionarioDto;
import com.farmacia.davi.model.FuncionarioModel;
import com.farmacia.davi.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository funcionarioRepository;


    @PostMapping
    public ResponseEntity<FuncionarioModel> salvar (@RequestBody @Valid FuncionarioDto funcionarioDto) {
        var funcionarioModel = new FuncionarioModel();
        BeanUtils.copyProperties(funcionarioDto, funcionarioModel);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(funcionarioRepository.save(funcionarioModel));
    }


    @GetMapping
    public ResponseEntity<List<FuncionarioModel>> listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(funcionarioRepository.findAll());
    }

    @GetMapping("/{cdFuncionario}")
    public ResponseEntity<Object> getFuncionario (@PathVariable("cdFuncionario")Integer cdFuncionario){
        Optional<FuncionarioModel> funcionario0 = funcionarioRepository.findById(cdFuncionario);
        if (funcionario0.isEmpty()){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Produto não encontrado");

        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(funcionario0.get());
    }

}
