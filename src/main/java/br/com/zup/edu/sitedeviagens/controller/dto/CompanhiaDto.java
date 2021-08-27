package br.com.zup.edu.sitedeviagens.controller.dto;

import br.com.zup.edu.sitedeviagens.model.Pais;

import java.time.LocalDateTime;

public class CompanhiaDto {

    private Long id;
    private String nome;
    private Pais pais ;
    private LocalDateTime instanteCriacao;

    public CompanhiaDto(Long id, String nome, Pais pais, LocalDateTime instanteCriacao) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
        this.instanteCriacao = instanteCriacao;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Pais getPais() {
        return pais;
    }
}
