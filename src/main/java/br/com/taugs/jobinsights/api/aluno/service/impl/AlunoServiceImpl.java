package br.com.taugs.jobinsights.api.aluno.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.taugs.jobinsights.api.aluno.model.entity.Aluno;
import br.com.taugs.jobinsights.api.aluno.repository.AlunoRepository;
import br.com.taugs.jobinsights.api.aluno.service.AlunoService;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class AlunoServiceImpl implements AlunoService {

	private final AlunoRepository repository;

	@Autowired
	public AlunoServiceImpl(AlunoRepository repository) {
		this.repository = repository;
	}

	@Override
	public Aluno salvar(Aluno entity) {
		return this.repository.save(entity);
	}

	@Override
	public List<Aluno> listAll() {
		return this.repository.findAll();
	}

	@Override
	public Aluno findById(Long id) {
		Optional<Aluno> alunoOp = this.repository.findById(id);
		if (alunoOp.isPresent()) {
			return alunoOp.get();
		}
		return null;
	}

}
