package br.com.zup.edu.sitedeviagens.model;

import br.com.zup.edu.sitedeviagens.validacao.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Rota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @NotBlank
    @ManyToOne
    private Aeroporto origem;

    @NotBlank
    @ManyToOne
    private Aeroporto destino;

    @NotBlank
    @Positive
    private Long duracao;

    public Rota(String nome, Aeroporto origem, Aeroporto destino, Long duracao) {
        this.nome = nome;
        this.origem = origem;
        this.destino = destino;
        this.duracao = duracao;
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
