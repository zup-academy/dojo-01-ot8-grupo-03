package br.com.zup.edu.sitedeviagens.controller;


import br.com.zup.edu.sitedeviagens.controller.dto.PaisDto;
import br.com.zup.edu.sitedeviagens.controller.form.PaisForm;
import br.com.zup.edu.sitedeviagens.model.Pais;
import br.com.zup.edu.sitedeviagens.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/paises")
public class PaisController {

    @Autowired
    PaisRepository paisRepository;

    @PostMapping
    @Transactional
    public PaisDto cadastrar(@RequestBody @Valid PaisForm form) {
        Pais pais = form.formToEntity();
        paisRepository.save(pais);

        return new PaisDto(pais);
    }
    

}
