package com.xp.tcc.tcc.controlador;

import com.xp.tcc.tcc.dominio.Aluno;
import com.xp.tcc.tcc.dominio.Professor;
import com.xp.tcc.tcc.service.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    private final ProfessorService professorService;

    @Autowired
    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping
    public ResponseEntity<List<Professor>> todos() {
        List<Professor> professores = professorService.todos();

        return ResponseEntity.ok(professores);
    }

    @PostMapping
    public ResponseEntity<Professor> salva(@RequestBody Professor professor) {
        Professor professorSalvo = professorService.salva(professor);
        return ResponseEntity.status(HttpStatus.CREATED).body(professorSalvo);
    }

    @GetMapping("/busca")
    public ResponseEntity<List<Professor>> buscarPorNome(@RequestParam String nome) {
        List<Professor> professoresAchados = professorService.buscaPorNome(nome);
        if(professoresAchados != null) {
            return ResponseEntity.ok(professoresAchados);
        }
        return ResponseEntity.noContent().build();

    }
}
