package br.edu.infnet.apiapolice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiapolice.domain.model.Apolice;
import br.edu.infnet.apiapolice.domain.service.ApoliceService;

@RestController
@RequestMapping("/api/apolice")
public class ApoliceController {
	
	@Autowired
	private ApoliceService apoliceService;

	
	@GetMapping(value = "/listar")
	public List<Apolice> obterlista() {
		return apoliceService.obterLista();
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir (@PathVariable Integer id) {
		apoliceService.excluir(id);
	}

	@PostMapping(value = "/incluir")
	public void incluir (@RequestBody Apolice apolice) {
		apoliceService.incluir(apolice);
	}

}
