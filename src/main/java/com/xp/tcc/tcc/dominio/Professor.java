package com.xp.tcc.tcc.dominio;

public class Professor {

    private Long id;
    private String nome;
    private String departamento;
    private String email;
    private String formacao;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
