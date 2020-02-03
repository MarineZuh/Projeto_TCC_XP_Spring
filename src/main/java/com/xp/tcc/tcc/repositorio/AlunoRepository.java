package com.xp.tcc.tcc.repositorio;

import com.xp.tcc.tcc.dominio.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
