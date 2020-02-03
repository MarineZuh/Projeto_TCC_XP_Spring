package com.xp.tcc.tcc.dominio;

import com.xp.tcc.tcc.dominio.Aluno;
import com.xp.tcc.tcc.dominio.Professor;

import javax.persistence.*;

@Entity
public class Tcc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTcc;
    @ManyToOne
    private Professor orientador;
    @ManyToOne
    private Aluno orientado;
    private String tema;


    public Aluno getOrientado() {
        return orientado;
    }

    public Long getIdTcc() {
        return idTcc;
    }

    public Professor getOrientador() {
        return orientador;
    }

    public String getTema() {
        return tema;
    }

    public void setIdTcc(Long idTcc) {
        this.idTcc = idTcc;
    }

    public void setOrientado(Aluno orientado) {
        this.orientado = orientado;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
