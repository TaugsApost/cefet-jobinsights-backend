package br.com.taugs.jobinsights.api.vaga.service;

import java.util.List;

import br.com.taugs.jobinsights.api.crud.service.AbstractService;
import br.com.taugs.jobinsights.api.vaga.model.dto.VagaFilterDTO;
import br.com.taugs.jobinsights.api.vaga.model.dto.VagaResponseDTO;
import br.com.taugs.jobinsights.api.vaga.model.entity.Vaga;

public interface VagaService extends AbstractService<Vaga> {

	List<VagaResponseDTO> findByFilter(VagaFilterDTO filter);

	List<VagaResponseDTO> findByFilterByUser(VagaFilterDTO filter);

	Vaga findById(Long id);

	Vaga editar(Vaga entity);

}
