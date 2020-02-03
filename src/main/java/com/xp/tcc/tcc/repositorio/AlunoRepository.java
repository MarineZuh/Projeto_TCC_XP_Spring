package com.xp.tcc.tcc.repositorio;

import com.xp.tcc.tcc.dominio.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    @Query("Select a from Aluno a where a.nome like %:nome%")
    public Aluno buscarPorNome(String nome);
}
