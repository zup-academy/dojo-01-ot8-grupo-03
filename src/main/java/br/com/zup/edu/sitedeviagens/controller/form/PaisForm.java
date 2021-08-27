package br.com.zup.edu.sitedeviagens.controller.form;

import br.com.zup.edu.sitedeviagens.model.Pais;
import javax.validation.constraints.NotBlank;

public class PaisForm {

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