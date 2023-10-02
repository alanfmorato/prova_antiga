package br.gov.sp.fatec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.gov.sp.fatec.entity.Trabalho;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long>{
     
    @Query("select t from trabalho t where t.nota > :nota and lower(t.titulo) like %:palavra%")
    List<Trabalho> findTrabalhosByNotaAndTituloContaining(Integer nota, String palavra)
}
