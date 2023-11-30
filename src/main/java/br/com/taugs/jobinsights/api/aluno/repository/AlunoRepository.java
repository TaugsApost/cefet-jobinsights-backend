package br.com.taugs.jobinsights.api.aluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.taugs.jobinsights.api.aluno.model.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
