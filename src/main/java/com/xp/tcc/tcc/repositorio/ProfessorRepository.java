package com.xp.tcc.tcc.repositorio;

import com.xp.tcc.tcc.dominio.Aluno;
import com.xp.tcc.tcc.dominio.Professor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    @Query("Select a from Professor a where a.nome like %:nome%")
    public List<Professor> buscarPorNome(String nome);
}
