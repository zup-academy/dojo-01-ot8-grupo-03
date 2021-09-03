package br.com.zup.edu.sitedeviagens.controller.form;

import br.com.zup.edu.sitedeviagens.model.Aeroporto;
import br.com.zup.edu.sitedeviagens.model.Companhia;
import br.com.zup.edu.sitedeviagens.model.Pais;
import br.com.zup.edu.sitedeviagens.repository.AeroportoRepository;

public class AeroportoForm {

    private String nome;
    private String pais;

    public AeroportoForm(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public Aeroporto formToEntity(AeroportoRepository aeroportoRepository) {
        Aeroporto aeroporto = aeroportoRepository.findFirstByNome(this.pais);

        return new Aeroporto(this.nome, aeroporto.getPais());
    }
}
