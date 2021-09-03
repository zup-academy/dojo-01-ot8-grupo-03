package br.com.zup.edu.sitedeviagens.model;

import br.com.zup.edu.sitedeviagens.validacao.ValorExclusivo;
import org.springframework.web.bind.MethodArgumentNotValidException;

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
    @ManyToOne
    private Pais pais;


    public Aeroporto(String nome, Pais pais) {
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
