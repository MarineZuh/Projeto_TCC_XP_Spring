package com.xp.tcc.tcc.service;


import com.xp.tcc.tcc.dominio.Aluno;
import com.xp.tcc.tcc.repositorio.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    @Autowired
    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Transactional(readOnly = true)
    public List<Aluno> todos() {
        return alunoRepository.findAll();
    }

    @Transactional
    public Aluno salva(Aluno aluno) {
        return alunoRepository.save(aluno);

    }

    @Transactional(readOnly = true)
    public Aluno buscaPorNome(String nome ) {
        return alunoRepository.buscarPorNome(nome );
    }

}
