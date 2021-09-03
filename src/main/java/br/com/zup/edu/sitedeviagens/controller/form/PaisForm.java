package br.com.zup.edu.sitedeviagens.controller.form;

import br.com.zup.edu.sitedeviagens.model.Pais;
import br.com.zup.edu.sitedeviagens.validacao.ValorExclusivo;

import javax.validation.constraints.NotBlank;

public class PaisForm {

    @ValorExclusivo( fieldName = "nome", domainClass = Pais.class, message = "Não pode ser repetido")
    @NotBlank
    private String nome;

    @Deprecated
    public PaisForm() {
    }

    public PaisForm(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Pais formToEntity(){
        return new Pais(this.nome);
    }
}