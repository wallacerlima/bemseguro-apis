package br.edu.infnet.apiveiculo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiveiculo.domain.model.Caminhao;
import br.edu.infnet.apiveiculo.domain.service.CaminhaoService;

@RestController
@RequestMapping("/api/veiculo")
public class CaminhaoController {
			
	@Autowired
	private CaminhaoService caminhaoService;
	
	@PostMapping(value = "/caminhao/incluir")
	public void incluir(@RequestBody Caminhao caminhao) {
		caminhaoService.incluir(caminhao);
	}

	@GetMapping(value = "/caminhao/listar")
	public List<Caminhao> obterLista() {
		return caminhaoService.obterLista();
	}
	
	@GetMapping(value = "/caminhao/{userId}/listar")
	public List<Caminhao> obterListaPorUsuario(@PathVariable Integer userId){
		return caminhaoService.obterListaPorUsuario(userId);
	}
}
