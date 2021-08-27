package br.com.zup.edu.sitedeviagens.controller.form;

import br.com.zup.edu.sitedeviagens.model.Pais;

public class PaisForm {

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


    public Pais convert(){
        return new Pais(this.nome);

    }
}
