package com.fiap.autorizadora.dto;


import java.time.LocalDate;

public class AlunoDTO {
    Long id;
    String nome;
    String ra;
    String cartao;
    Integer limite;
    LocalDate deletedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public Integer getLimite() {
        return limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }

    public LocalDate getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDate deletedAt) {
        this.deletedAt = deletedAt;
    }

    public AlunoDTO alunoDTO() {
        AlunoDTO aluno = new AlunoDTO();
        aluno.setId(id);
        aluno.setNome(nome);
        aluno.setRa(ra);
        aluno.setCartao(cartao);
        aluno.setLimite(limite);
        aluno.setDeletedAt(deletedAt);
        return aluno;
    }


}
