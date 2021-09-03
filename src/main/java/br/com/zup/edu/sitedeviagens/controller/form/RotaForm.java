package br.com.zup.edu.sitedeviagens.controller.form;

import br.com.zup.edu.sitedeviagens.model.*;
import br.com.zup.edu.sitedeviagens.repository.*;

import javax.persistence.*;
import javax.validation.constraints.*;

public class RotaForm {

    private String nome;

    @NotBlank
    @ManyToOne
    private String origem;

    @NotBlank
    @ManyToOne
    private String destino;

    @NotBlank
    @Positive
    private Long duracao;

    public RotaForm(String nome, String origem, String destino, Long duracao) {
        this.nome = nome;
        this.origem = origem;
        this.destino = destino;
        this.duracao = duracao;
    }

    public Rota toModel(RotaRepository repository){
        if(origem == destino){
            throw new IllegalArgumentException("Rota de origem não pode ser igual a rota de destino");
        }else{
            repository.findById(origem);

        }

    return new Rota();
    }

}
