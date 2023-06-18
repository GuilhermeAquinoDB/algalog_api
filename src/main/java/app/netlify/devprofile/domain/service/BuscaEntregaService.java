package app.netlify.devprofile.domain.service;

import org.springframework.stereotype.Service;

import app.netlify.devprofile.domain.exception.EntidadeNaoEncontradaException;
import app.netlify.devprofile.domain.model.Entrega;
import app.netlify.devprofile.domain.repository.EntregaRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {

	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}
}
