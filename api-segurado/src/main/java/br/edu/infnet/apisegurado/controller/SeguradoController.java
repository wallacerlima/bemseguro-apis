package br.edu.infnet.apisegurado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apisegurado.domain.model.Segurado;
import br.edu.infnet.apisegurado.domain.service.SeguradoService;

@RestController
@RequestMapping("/api/segurado")
public class SeguradoController {
	
	@Autowired
	private SeguradoService seguradoService;
	
	@GetMapping(value = "/listar")
	public List<Segurado> obterLista() {
		return seguradoService.obterLista();
	}
	
	@GetMapping(value = "/usuario/{idUsuario}")
	public List<Segurado> obterLista(@PathVariable Integer idUsuario) {
		return seguradoService.obterLista(idUsuario);
	}
	
	@GetMapping(value = "/{id}")
	public Segurado obterPorId(@PathVariable Integer id) {
		return seguradoService.obterPorId(id);
	}
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Segurado segurado) {
		seguradoService.incluir(segurado);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		seguradoService.excluir(id);	
	}


}
