package br.com.zup.edu.sitedeviagens.controller.dto;

import br.com.zup.edu.sitedeviagens.model.Pais;

public class PaisDto {

    private Long id;
    private String nome;

    public PaisDto(Pais pais) {
        this.nome = pais.getNome();
        this.id = pais.getId();
    }

    public PaisDto formToDto(Pais pais) {
        return new PaisDto(pais);
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }
}
