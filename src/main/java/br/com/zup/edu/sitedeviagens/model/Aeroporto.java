package br.com.zup.edu.sitedeviagens.model;

import br.com.zup.edu.sitedeviagens.validacao.ValorExclusivo;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.StringBufferInputStream;

@Entity
public class Aeroporto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @ValorExclusivo(domainClass = Aeroporto.class, fieldName = "nome", message = "Nome precisa ser exclusivo")
    private String nome;

    @NotBlank
    @OneToMany
    private Pais pais;


    public Aeroporto(Long id, String nome, Pais pais) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
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
