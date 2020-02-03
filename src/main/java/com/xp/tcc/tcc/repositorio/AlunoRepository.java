package com.xp.tcc.tcc.repositorio;

import com.xp.tcc.tcc.dominio.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
