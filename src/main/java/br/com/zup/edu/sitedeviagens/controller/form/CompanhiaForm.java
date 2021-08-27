package br.com.zup.edu.sitedeviagens.controller.form;
import br.com.zup.edu.sitedeviagens.model.Companhia;
import br.com.zup.edu.sitedeviagens.model.Pais;
import br.com.zup.edu.sitedeviagens.repository.PaisRepository;

import javax.validation.constraints.NotBlank;
import java.util.Optional;

public class CompanhiaForm {

    @NotBlank
    private String nome;

    @NotBlank
    private String pais;

    public CompanhiaForm(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public Companhia formToEntity(PaisRepository paisRepository) {
        Pais pais = paisRepository.findFirstByNome(this.pais);

        return new Companhia(this.nome, pais);
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }
}
