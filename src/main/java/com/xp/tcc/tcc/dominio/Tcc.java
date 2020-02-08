package com.xp.tcc.tcc.dominio;

import com.xp.tcc.tcc.dominio.Aluno;
import com.xp.tcc.tcc.dominio.Professor;

import javax.persistence.*;

@Entity
public class Tcc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "orientador")
    private Professor orientador;
    
    @ManyToOne
    @JoinColumn(name = "orientando")
    private Aluno orientando;
    
    private String tema;


    public Aluno getOrientando() {
        return orientando;
    }

    public Long getId() {
        return id;
    }

    public Professor getOrientador() {
        return orientador;
    }

    public String getTema() {
        return tema;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrientando(Aluno orientando) {
        this.orientando = orientando;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
