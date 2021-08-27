package br.com.zup.edu.sitedeviagens.controller;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/bemvindo")
public class BemVindo {

    @GetMapping
    public String bemVindo(){
        return "A aplicação rodou";
    }



}
