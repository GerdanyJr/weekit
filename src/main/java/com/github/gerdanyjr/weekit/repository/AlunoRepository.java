package com.github.gerdanyjr.weekit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.gerdanyjr.weekit.model.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    // @Query(value = "SELECT a FROM Aluno a WHERE a.nMatricula = :matricula") -> Exemplo usando JPQL
    // @Query(value = "SELECT * FROM Aluno a WHERE a.nMatricula = :matricula", nativeQueery = true) -> Exemplo usando SQL
    Optional<Aluno> findByNMatricula(String matricula);

    Optional<Aluno> findByCpf(String cpf);
}