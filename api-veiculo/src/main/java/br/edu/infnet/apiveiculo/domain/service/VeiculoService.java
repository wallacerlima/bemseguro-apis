package br.edu.infnet.apiveiculo.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiveiculo.domain.model.Veiculo;
import br.edu.infnet.apiveiculo.domain.repository.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepository;


	public List<Veiculo> obterLista() {
		 return veiculoRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
	}

	public void excluir(Integer id) {
		veiculoRepository.deleteById(id);
	}

	public Veiculo obterPorId(Integer id) {

		return veiculoRepository.findById(id).orElse(null);
	}
	
	public void incluir(Veiculo veiculo) {
		veiculoRepository.save(veiculo);
	}

	public Long obterQtd() {
		return veiculoRepository.count();
	}

}
