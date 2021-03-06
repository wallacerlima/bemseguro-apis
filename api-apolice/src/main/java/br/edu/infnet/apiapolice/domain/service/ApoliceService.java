package br.edu.infnet.apiapolice.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiapolice.domain.model.Apolice;
import br.edu.infnet.apiapolice.domain.repository.ApoliceRepository;


@Service
public class ApoliceService {

	@Autowired
	private ApoliceRepository apoliceRepository;

	public List<Apolice> obterLista() {
		return apoliceRepository.findAll(Sort.by(Sort.Direction.ASC, "data"));
	}

	public List<Apolice> obterLista(Integer userId) {
		 return apoliceRepository.findAll(userId,Sort.by(Sort.Direction.DESC, "data"));
	}

	public void incluir(Apolice Apolice) {
		apoliceRepository.save(Apolice);
	}

	public void excluir(Integer id) {
		apoliceRepository.deleteById(id);
	}

	public Apolice obterPorId(Integer id) {
		return apoliceRepository.findById(id).orElse(null);
	}

	public Long obterQtd() {
		return apoliceRepository.count();
	}
}
