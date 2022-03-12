package br.edu.infnet.apiveiculo.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiveiculo.domain.model.Motocicleta;
import br.edu.infnet.apiveiculo.domain.repository.MotocicletaRepository;

@Service
public class MotocicletaService {

	@Autowired
	private MotocicletaRepository motocicletaRepository;

	public List<Motocicleta> obterLista() {
		return motocicletaRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
	}

	public List<Motocicleta> obterLista(Integer userId) {
		 return (List<Motocicleta>) motocicletaRepository.findAll(userId,
		 Sort.by(Sort.Direction.ASC, "id"));
	}

	public void incluir(Motocicleta motocicleta) {
		motocicletaRepository.save(motocicleta);
	}

	public void excluir(Integer id) {
		motocicletaRepository.deleteById(id);
	}

	public Long obterQtd() {
		return motocicletaRepository.count();
	}
}