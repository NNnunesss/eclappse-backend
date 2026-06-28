package br.com.eclappse.model.entity;

import java.time.LocalDate;

public class Denuncia {

    private Long id;
    private String descricao;
    private LocalDate data;
    private Boolean anonima;

    public Denuncia() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Boolean getAnonima() {
        return anonima;
    }

    public void setAnonima(Boolean anonima) {
        this.anonima = anonima;
    }
}