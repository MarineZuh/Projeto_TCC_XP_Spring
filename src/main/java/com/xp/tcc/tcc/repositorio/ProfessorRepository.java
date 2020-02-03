package com.xp.tcc.tcc.repositorio;

import com.xp.tcc.tcc.dominio.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
