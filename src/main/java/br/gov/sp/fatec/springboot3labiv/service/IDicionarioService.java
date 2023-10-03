package br.gov.sp.fatec.springboot3labiv.service;

import java.time.LocalDateTime;
import java.util.List;

import br.gov.sp.fatec.springboot3labiv.entity.Dicionario;

public interface IDicionarioService {
    
    public Dicionario novoTrabalho(Dicionario trabalho);

    public List<Dicionario> buscarTodosTrabalhos();

    public List<Dicionario> buscarPorVerbeteESignificado(String parametroVerbete, String parametroSignificado);

}