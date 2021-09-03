package br.com.zup.edu.sitedeviagens.controller;

import br.com.zup.edu.sitedeviagens.controller.dto.AeroportoDto;
import br.com.zup.edu.sitedeviagens.controller.form.AeroportoForm;
import br.com.zup.edu.sitedeviagens.model.Aeroporto;
import br.com.zup.edu.sitedeviagens.repository.AeroportoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/aeroportos")
public class AeroportoController {

    @Autowired
    AeroportoRepository aeroportoRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AeroportoDto cadastrar(@RequestBody @Valid AeroportoForm form) {
        Aeroporto aeroporto = form.formToEntity(aeroportoRepository);
        aeroportoRepository.save(aeroporto);

        return new AeroportoDto(aeroporto);
    }

}
