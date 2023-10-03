package br.gov.sp.fatec.springboot3labiv.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springboot3labiv.entity.Trabalho;
import br.gov.sp.fatec.springboot3labiv.repository.TrabalhoRepository;

@Service
public class TrabalhoService implements ITrabalhoService {

    @Autowired
    private TrabalhoRepository traRepo;

    @Override
    public Trabalho buscarPorId(Long id) {
        Optional<Trabalho> trabalhoOP = traRepo.findById(id);
        if(trabalhoOP.isPresent()){
            return trabalhoOP.get();
        }
        throw new UnsupportedOperationException("ID inválido!!'");
    }

    @Override
    public Trabalho novoTrabalho(Trabalho trabalho) {
        if(trabalho == null ||
        trabalho.getId() == null ||
        trabalho.getTitulo() == null ||
        trabalho.getNota() == null ||
        trabalho.getJustificativa() == null ||
        trabalho.getDescricao() == null ||
        trabalho.getData_hora_entrega() == null) {
        throw new IllegalArgumentException("Valores inválidos!");
        }
        return traRepo.save(trabalho);
    }

    @Override
    public List<Trabalho> buscarTodosTrabalhos() {
        return traRepo.findAll();
    }
    
}
