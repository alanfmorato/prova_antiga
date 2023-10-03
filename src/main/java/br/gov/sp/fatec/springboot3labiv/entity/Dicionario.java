package br.gov.sp.fatec.springboot3labiv.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dcn_dicionario")
public class Dicionario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define o id como auto_increment]
    @Column(name = "dcn_id")
    private Long id;

    @Column(name = "dcn_verbete")
    private String verbete;

    @Column(name = "dcn_significado")
    private String significado;

    @Column(name = "dcn_versao")
    private Integer versao;

    @Column(name = "dcn_data_hora_cadastro")
    private LocalDateTime data_hora_cadastro;

    @Column(name = "dcn_data_hora_revisado")
    private LocalDateTime data_hora_revisado;



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public String getVerbete() {
        return verbete;
    }



    public void setVerbete(String verbete) {
        this.verbete = verbete;
    }



    public String getSignificado() {
        return significado;
    }



    public void setSignificado(String significado) {
        this.significado = significado;
    }



    public Integer getVersao() {
        return versao;
    }



    public void setVersao(Integer versao) {
        this.versao = versao;
    }



    public LocalDateTime getData_hora_cadastro() {
        return data_hora_cadastro;
    }



    public void setData_hora_cadastro(LocalDateTime data_hora_cadastro) {
        this.data_hora_cadastro = data_hora_cadastro;
    }



    public LocalDateTime getData_hora_revisado() {
        return data_hora_revisado;
    }



    public void setData_hora_revisado(LocalDateTime data_hora_revisado) {
        this.data_hora_revisado = data_hora_revisado;
    }


    
    public Dicionario() {
    }



    public Dicionario(String verbete, String significado,  Integer versao, LocalDateTime data_hora_cadastro, LocalDateTime data_hora_revisado) {
        this.verbete = verbete;
        this.significado = significado;
        this.versao = versao;
        this.data_hora_cadastro = data_hora_cadastro;
        this.data_hora_revisado = data_hora_revisado;
        }

}