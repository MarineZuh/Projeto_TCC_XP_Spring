package com.xp.tcc.tcc.repositorio;

import com.xp.tcc.tcc.dominio.Tcc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TccRepository extends JpaRepository<Tcc, Long> {
}
