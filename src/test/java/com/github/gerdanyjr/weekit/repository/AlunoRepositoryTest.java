package com.github.gerdanyjr.weekit.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.github.gerdanyjr.weekit.model.entity.Aluno;

@DataJpaTest
public class AlunoRepositoryTest {

    @Autowired
    private AlunoRepository alunoRepository;

    private Aluno aluno;

    @BeforeEach
    void setup() {
        aluno = new Aluno(
                1L,
                "teste",
                "sobrenomeTeste",
                "202211191111",
                "12345678912",
                LocalDate.now(),
                List.of());
    }

    @DisplayName("Should return Aluno when a existing value for nMatricula is passed")
    @Test
    void givenMatricula_whenFindByMatricula_thenReturnAluno() {
        // given
        alunoRepository.save(aluno);

        // when
        Optional<Aluno> foundAluno = alunoRepository.findByNMatricula("202211191111");

        // then
        assertTrue(foundAluno.isPresent());
        assertNotNull(foundAluno.get());
    }

    @DisplayName("Should return Aluno when a existing value for cpf is passed")
    @Test
    void givenCpf_whenFindByCpf_thenReturnAluno() {
        // given
        alunoRepository.save(aluno);

        // when
        Optional<Aluno> foundAluno = alunoRepository.findByCpf("12345678912");

        // then
        assertTrue(foundAluno.isPresent());
        assertNotNull(foundAluno.get());
    }
}
