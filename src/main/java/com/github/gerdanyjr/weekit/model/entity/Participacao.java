package com.github.gerdanyjr.weekit.model.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class Participacao {

    @EmbeddedId
    private ParticipacaoId id;

    @ManyToOne
    @MapsId("alunoId")
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @ManyToOne
    @MapsId("minicursoId")
    @JoinColumn(name = "minicurso_id")
    private Minicurso minicurso;

    public Participacao() {
    }

    public Participacao(ParticipacaoId id, Aluno aluno, Minicurso minicurso) {
        this.id = id;
        this.aluno = aluno;
        this.minicurso = minicurso;
    }

    public ParticipacaoId getId() {
        return id;
    }

    public void setId(ParticipacaoId id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Minicurso getMinicurso() {
        return minicurso;
    }

    public void setMinicurso(Minicurso minicurso) {
        this.minicurso = minicurso;
    }

}
