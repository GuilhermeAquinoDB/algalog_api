package app.netlify.devprofile.domain.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import app.netlify.devprofile.domain.model.Entrega;
import app.netlify.devprofile.domain.repository.EntregaRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class FinalizacaoEntregaService {

	private EntregaRepository entregaRepository;
	private BuscaEntregaService buscaEntregaService;
	
	@Transactional
	public void finalizar(Long entregaId) {
		Entrega entrega = buscaEntregaService.buscar(entregaId);
		
		entrega.finalizar();
		
		entregaRepository.save(entrega);
	}
}
