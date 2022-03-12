package br.edu.infnet.apiveiculo.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiveiculo.domain.model.Carro;
import br.edu.infnet.apiveiculo.domain.repository.CarroRepository;

@Service
public class CarroService {

	@Autowired
	private CarroRepository carroRepository;

	public List<Carro> obterLista() {
		return carroRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
	}

	public List<Carro> obterLista(Integer id) {
		 return carroRepository.findAll(id, Sort.by(Sort.Direction.ASC, "id"));
	}

	public void incluir(Carro carro) {
		carroRepository.save(carro);
	}

	public void excluir(Integer id) {
		carroRepository.deleteById(id);
	}

	public Carro obterPorId(Integer id) {
		return carroRepository.findById(id).orElse(null);
	}

	public Long obterQtd() {
		return carroRepository.count();
	}
}