package br.gov.sp.fatec.springboot3labiv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.sp.fatec.springboot3labiv.entity.Trabalho;

@Repository
public interface TrabalhoRepository extends JpaRepository<Trabalho, Long>{

    @Query("select t from Trabalho t where t.nota > :nota and lower(t.titulo) like %:palavra%")
    List<Trabalho> findTrabalhosByNotaAndTituloContaining(Integer nota, String palavra);

    
    
}
