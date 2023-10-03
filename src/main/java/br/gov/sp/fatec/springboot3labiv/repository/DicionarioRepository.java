package br.gov.sp.fatec.springboot3labiv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.sp.fatec.springboot3labiv.entity.Dicionario;

@Repository
public interface DicionarioRepository extends JpaRepository<Dicionario, Long>{

    @Query("SELECT d FROM Dicionario d WHERE d.verbete = ?1 AND d.significado LIKE CONCAT('%', ?2, '%')")
    List<Dicionario> findByVerbeteAndSignificadoContaining(String parametroVerbete, String parametroSignificado);
    
}