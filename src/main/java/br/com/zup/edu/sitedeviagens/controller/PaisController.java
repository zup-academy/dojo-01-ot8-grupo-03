package br.com.zup.edu.sitedeviagens.controller;


import br.com.zup.edu.sitedeviagens.controller.dto.PaisDto;
import br.com.zup.edu.sitedeviagens.controller.form.PaisForm;
import br.com.zup.edu.sitedeviagens.model.Pais;
import br.com.zup.edu.sitedeviagens.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/paises")
public class PaisController {

    @Autowired
    PaisRepository paisRepository;

    @PostMapping
    @Transactional
    @ResponseStatus(HttpStatus.CREATED)
    public PaisDto cadastrar(@RequestBody @Valid PaisForm form) {
        Pais pais = form.formToEntity();
        paisRepository.save(pais);

        return new PaisDto(pais);
    }
    

}
