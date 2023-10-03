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

import br.gov.sp.fatec.springboot3labiv.entity.Dicionario;
import br.gov.sp.fatec.springboot3labiv.service.IDicionarioService;

@RestController
@RequestMapping(value = "/dicionario")
@CrossOrigin
public class DicionarioController {

    @Autowired
    private IDicionarioService service;

    @GetMapping
    public List<Dicionario> buscarTodos(){
        return service.buscarTodosTrabalhos();
    }

    @PostMapping
    public Dicionario novoTrabalho(@RequestBody Dicionario dicionario){
         return service.novoTrabalho(dicionario);
    }

    @GetMapping("/buscar-dicionario/{verbete}/{significado}")
    public List<Dicionario> buscarDicionario(
            @PathVariable String verbete,
            @PathVariable String significado
    ) {
        return service.buscarPorVerbeteESignificado(verbete, significado);
    }
}