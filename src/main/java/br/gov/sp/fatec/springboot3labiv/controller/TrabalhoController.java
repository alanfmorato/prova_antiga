package br.gov.sp.fatec.springboot3labiv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springboot3labiv.entity.Trabalho;
import br.gov.sp.fatec.springboot3labiv.service.ITrabalhoService;

@RestController
@RequestMapping(value = "/trabalho")
@CrossOrigin
public class TrabalhoController {

    @Autowired
    private ITrabalhoService service;

    @GetMapping
    public List<Trabalho> buscarTodos(){
        return service.buscarTodosTrabalhos();
    }

    @PostMapping
    public Trabalho novoTrabalho(@RequestBody Trabalho trabalho){
        return service.novoTrabalho(trabalho);
    }

    @GetMapping(value = "/{id}")
    public Trabalho buscarPorId(@PathVariable("id") Long id){
        return service.buscarPorId(id);
    }

}
