package br.com.zup.edu.sitedeviagens.controller;

import br.com.zup.edu.sitedeviagens.controller.dto.CompanhiaDto;
import br.com.zup.edu.sitedeviagens.controller.dto.PaisDto;
import br.com.zup.edu.sitedeviagens.controller.form.CompanhiaForm;
import br.com.zup.edu.sitedeviagens.controller.form.PaisForm;
import br.com.zup.edu.sitedeviagens.model.Companhia;
import br.com.zup.edu.sitedeviagens.model.Pais;
import br.com.zup.edu.sitedeviagens.repository.CompanhiaRepository;
import br.com.zup.edu.sitedeviagens.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/companhias")
public class CompanhiaController {

    @Autowired
    CompanhiaRepository companhiaRepository;

    @Autowired
    PaisRepository paisRepository;

    @PostMapping
    @Transactional
    @ResponseStatus(HttpStatus.CREATED)
    public CompanhiaDto cadastrar(@RequestBody @Valid CompanhiaForm form) {
        Companhia companhia = form.formToEntity(paisRepository);
        companhiaRepository.save(companhia);

        return new CompanhiaDto(companhia);
    }

}
