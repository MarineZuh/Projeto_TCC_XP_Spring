package com.xp.tcc.tcc.service;

import com.xp.tcc.tcc.dominio.Aluno;
import com.xp.tcc.tcc.dominio.Professor;
import com.xp.tcc.tcc.dominio.Tcc;
import com.xp.tcc.tcc.repositorio.AlunoRepository;
import com.xp.tcc.tcc.repositorio.TccRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TccService {

    private final TccRepository tccRepository;
    @Autowired
    public TccService(TccRepository tccRepository) {
        this.tccRepository = tccRepository;
    }

    @Transactional(readOnly = true)
    public List<Tcc> todos() {
        return tccRepository.findAll();
    }

    @Transactional
    public Tcc salva(Tcc tcc) {
        return tccRepository.save(tcc);

    }
}
