package br.edu.infnet.apiveiculo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiveiculo.domain.model.Veiculo;
import br.edu.infnet.apiveiculo.domain.service.VeiculoService;

@RestController
@RequestMapping("/api/veiculo")
public class VeiculoController {

	@Autowired
	private VeiculoService veiculoService;

	@GetMapping(value = "/listar")
	public List<Veiculo> obterLista() {
		return veiculoService.obterLista();
	}
	
	@GetMapping(value = "/{id}")
	public Veiculo obterPorId(@PathVariable Integer id) {
		return veiculoService.obterPorId(id);
	}
	
	@GetMapping(value = "/usuario/{idUsuario}/listar")
	public List<Veiculo> obterLista(@PathVariable Integer idUsuario) {
		return veiculoService.obterLista(idUsuario);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		veiculoService.excluir(id);
	}
}
