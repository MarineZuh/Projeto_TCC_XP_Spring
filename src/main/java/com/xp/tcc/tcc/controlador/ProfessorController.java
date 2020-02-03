package com.xp.tcc.tcc.controlador;

import com.xp.tcc.tcc.dominio.Professor;
import com.xp.tcc.tcc.service.ProfessorService;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
