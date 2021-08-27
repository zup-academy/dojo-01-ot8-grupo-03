package br.com.zup.edu.sitedeviagens.controller.dto;

import br.com.zup.edu.sitedeviagens.model.Pais;

public class PaisDto {

    private String nome;

    public PaisDto(String nome) {
        this.nome = nome;
    }

    public PaisDto(Pais pais) {
        this.nome = pais.getNome();
    }

    public PaisDto formToDto(Pais pais) {
        return new PaisDto(pais.getNome());
    }
}
