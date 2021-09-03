package br.com.zup.edu.sitedeviagens.controller.dto;

import br.com.zup.edu.sitedeviagens.model.*;

import javax.persistence.*;
import javax.validation.constraints.*;

public class RotaDto {
    private Long id;
    private String nome;
    private Aeroporto origem;
    private Aeroporto destino;
    private Long duracao;

    public RotaDto(Rota rota) {
        this.id = rota.getId();
        this.nome = rota.getNome();
        this.origem = rota.getOrigem();
        this.destino = rota.getDestino();
        this.duracao = rota.getDuracao();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public Long getDuracao() {
        return duracao;
    }
}
