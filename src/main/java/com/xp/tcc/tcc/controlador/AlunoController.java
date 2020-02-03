package com.xp.tcc.tcc.controlador;

import com.xp.tcc.tcc.dominio.Aluno;
import com.xp.tcc.tcc.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<Aluno> salva(@RequestBody Aluno aluno) {
        Aluno alunoSalvo = alunoService.salva(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoSalvo);
    }

    @GetMapping("/busca")
    public ResponseEntity<Aluno> buscarPorNome(@RequestParam String nome) {
        Aluno alunoAchado = alunoService.buscaPorNome(nome);
        if(alunoAchado != null) {
            return ResponseEntity.ok(alunoAchado);
        }
        return ResponseEntity.noContent().build();

    }

}
