package com.xp.tcc.tcc.dominio;

import com.xp.tcc.tcc.dominio.Aluno;
import com.xp.tcc.tcc.dominio.Professor;

public class Tcc {

    private Professor orientador;
    private Aluno orientado;
    private String tema;
    private Long idTcc;

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
