package com.github.gerdanyjr.weekit.model.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Minicurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Integer maxParticipantes;

    @OneToMany(mappedBy = "minicurso")
    private List<Participacao> participantes;

    public Minicurso() {
    }

    public Minicurso(Long id, String nome, String descricao, Integer maxParticipantes,
            List<Participacao> participantes) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.maxParticipantes = maxParticipantes;
        this.participantes = participantes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Participacao> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participacao> participantes) {
        this.participantes = participantes;
    }

    public Integer getMaxParticipantes() {
        return maxParticipantes;
    }

    public void setMaxParticipantes(Integer maxParticipantes) {
        this.maxParticipantes = maxParticipantes;
    }

}
