package com.xp.tcc.tcc.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String curso;
    private String email;

    public Long getId() {
        return id;
    }

    public String getCurso() {
        return curso;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
