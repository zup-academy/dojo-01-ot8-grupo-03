package br.com.zup.edu.sitedeviagens.controller.dto;

import br.com.zup.edu.sitedeviagens.model.Aeroporto;
import br.com.zup.edu.sitedeviagens.model.Pais;
import br.com.zup.edu.sitedeviagens.validacao.ValorExclusivo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

public class AeroportoDto {

    private Long id;
    private String nome;
    private Pais pais;

    public AeroportoDto(Long id, String nome, Pais pais) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
    }

    public AeroportoDto (Aeroporto aeroporto){
        this.id = aeroporto.getId();
        this.nome = aeroporto.getNome();
        this.pais = aeroporto.getPais();
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
