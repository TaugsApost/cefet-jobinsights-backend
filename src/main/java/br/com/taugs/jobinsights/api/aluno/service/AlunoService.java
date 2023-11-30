package br.com.taugs.jobinsights.api.aluno.service;

import br.com.taugs.jobinsights.api.aluno.model.entity.Aluno;
import br.com.taugs.jobinsights.api.crud.service.AbstractService;

public interface AlunoService extends AbstractService<Aluno> {

	Aluno findById(Long id);

}
