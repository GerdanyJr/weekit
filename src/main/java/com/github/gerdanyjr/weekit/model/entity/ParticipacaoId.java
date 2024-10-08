package com.github.gerdanyjr.weekit.model.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class ParticipacaoId implements Serializable {
    private Long alunoId;
    private Long minicursoId;

    public ParticipacaoId() {
    }

    public ParticipacaoId(Long alunoId, Long minicursoId) {
        this.alunoId = alunoId;
        this.minicursoId = minicursoId;
    }

    public Long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }

    public Long getMinicursoId() {
        return minicursoId;
    }

    public void setMinicursoId(Long minicursoId) {
        this.minicursoId = minicursoId;
    }

}
