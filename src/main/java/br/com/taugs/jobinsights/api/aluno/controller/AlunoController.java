package br.com.taugs.jobinsights.api.aluno.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.taugs.jobinsights.api.aluno.model.entity.Aluno;
import br.com.taugs.jobinsights.api.aluno.service.AlunoService;
import br.com.taugs.jobinsights.api.usuario.model.entity.Usuario;
import br.com.taugs.jobinsights.utils.RestMapping;

@CrossOrigin("*")
@RestController
@RequestMapping("/aluno")
public class AlunoController {

	private final AlunoService service;

	@Autowired
	public AlunoController(AlunoService service) {
		this.service = service;
	}

	@GetMapping(value = RestMapping.DETALHAR)
	public ResponseEntity<Usuario> confirmar(@PathVariable("id") Long id) {
		Aluno aluno = service.findById(id);
		if (aluno == null) {
			return ResponseEntity.of(Optional.empty());
		}
		return ResponseEntity.ok(aluno);
	}

}
