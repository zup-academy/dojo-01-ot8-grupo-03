package br.com.zup.edu.sitedeviagens.controller.dto;

public class PaisDto {

    private String nome;

    @Deprecated
    public PaisDto() {
    }

    public PaisDto(String nome) {
        this.nome = nome;
    }

}
