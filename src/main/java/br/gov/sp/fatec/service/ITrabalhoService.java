package br.gov.sp.fatec.service;

import java.util.List;

import br.gov.sp.fatec.entity.Trabalho;

public interface ITrabalhoService {
    public Trabalho buscaPorId(Long id);

    public Trabalho novoTrabalho(Trabalho trabalho);

    public List<Trabalho> buscarTodos();
    
}
