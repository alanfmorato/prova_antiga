package br.gov.sp.fatec.springboot3labiv.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springboot3labiv.entity.Dicionario;
import br.gov.sp.fatec.springboot3labiv.repository.DicionarioRepository;

@Service
public class DicionarioService implements IDicionarioService {

    @Autowired
    private DicionarioRepository repo;

    public Dicionario novoTrabalho(Dicionario dicionario) {
         if (dicionario == null || 
         dicionario.getSignificado() == null ||
         dicionario.getVerbete() == null ||
         dicionario.getVersao() == null ||
         dicionario.getData_hora_cadastro() == null ||
         dicionario.getData_hora_revisado() == null) {
             throw new IllegalArgumentException("Valores inválidos!");
         }
         return repo.save(dicionario);
     }

    @Override
    public List<Dicionario> buscarTodosTrabalhos() {
        return repo.findAll();
    }

    public List<Dicionario> buscarPorVerbeteESignificado(String parametroVerbete, String parametroSignificado) {
        return repo.findByVerbeteAndSignificadoContaining(parametroVerbete, parametroSignificado);
    }
    
}