package br.gov.sp.fatec.springboot3labiv.service;

import java.util.List;

import br.gov.sp.fatec.springboot3labiv.entity.Trabalho;

public interface ITrabalhoService {
    
    public Trabalho buscarPorId(Long id);

    public Trabalho novoTrabalho(Trabalho trabalho);

    public List<Trabalho> buscarTodosTrabalhos();

}
