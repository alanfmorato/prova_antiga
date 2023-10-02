package br.gov.sp.fatec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.gov.sp.fatec.entity.Trabalho;
import br.gov.sp.fatec.repository.TrabalhoRepository;

public class TrabalhoService implements ITrabalhoService {
    @Autowired
    private TrabalhoRepository traRepo;

    @Override
    public Trabalho buscaPorId(Long id) {
        Optional<Trabalho> trabalhoOP = traRepo.findById(id);
        if(trabalhoOP.isPresent()){
            return trabalhoOP.get();

        }
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("id Invalido");
    }

    @Override
    public Trabalho novoTrabalho(Trabalho trabalho) {
        if(trabalho == null ||
        trabalho.getId() == null ||
        trabalho.getTitulo() == null ||
        trabalho.getNota() == null ||
        trabalho.getJustificativa() == null ||
        trabalho.getDescricao() == null ||
        trabalho.getData_hora_entrega() == null){
        throw new UnsupportedOperationException("Valores Inválidos");
        }
        return traRepo.save(trabalho);
        // TODO Auto-generated method stub
    }

    @Override
    public List<Trabalho> buscarTodos() {
        return traRepo.findAll();
        // TODO Auto-generated method stub
    }
    
}
