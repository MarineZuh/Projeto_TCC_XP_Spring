package com.xp.tcc.tcc.service;

import com.xp.tcc.tcc.controlador.ProfessorController;
import com.xp.tcc.tcc.dominio.Aluno;
import com.xp.tcc.tcc.dominio.Professor;
import com.xp.tcc.tcc.repositorio.AlunoRepository;
import com.xp.tcc.tcc.repositorio.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    @Autowired
    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    @Transactional(readOnly = true)
    public List<Professor> todos() {
        return professorRepository.findAll();
    }
}
