package br.edu.infnet.apiveiculo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiveiculo.domain.model.Carro;
import br.edu.infnet.apiveiculo.domain.service.CarroService;

@RestController
@RequestMapping("/api/veiculo")
public class CarroController {

	@Autowired
	private CarroService carroService;

	
	@PostMapping(value = "/carro/incluir")
	public void incluir(@RequestBody Carro carro) {
		carroService.incluir(carro);
	}
	
	@GetMapping(value = "/carro/listar")
	public List<Carro> obterLista(){
		return carroService.obterLista();
	}
	
	@GetMapping(value = "/carro/{id}/listar")
	public List<Carro> obterLista(@PathVariable Integer id){
		return carroService.obterLista(id);
	}

}
