package com.xp.tcc.tcc.controlador;

import com.xp.tcc.tcc.dominio.Aluno;
import com.xp.tcc.tcc.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoService alunoService;

    @Autowired
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> todos() {
        List<Aluno> alunos = alunoService.todos();

        return ResponseEntity.ok(alunos);
    }

}
