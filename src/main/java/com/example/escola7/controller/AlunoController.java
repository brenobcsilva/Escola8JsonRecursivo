package com.example.escola7.controller;

import com.example.escola7.persistence.repository.AlunoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    private final AlunoRepository alunoRepository;


    public AlunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @GetMapping("/mostrarTodosAlunos")
    private ResponseEntity<?> mostrarAlunos(){
        return new ResponseEntity<>(alunoRepository.findAll(), HttpStatus.OK);
    }
}
