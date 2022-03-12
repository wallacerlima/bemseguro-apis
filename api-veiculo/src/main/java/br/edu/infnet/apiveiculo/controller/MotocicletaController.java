package br.edu.infnet.apiveiculo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiveiculo.domain.model.Motocicleta;
import br.edu.infnet.apiveiculo.domain.service.MotocicletaService;

@RestController
@RequestMapping("/api/veiculo")
public class MotocicletaController {

	@Autowired
	private MotocicletaService motocicletaService;
	
	@PostMapping(value = "/motocicleta/incluir")
	public void incluir(@RequestBody Motocicleta motocicleta) {
		motocicletaService.incluir(motocicleta);
	}

	@GetMapping(value = "/motocicleta/listar")
	public List<Motocicleta> obterLista(){
		return motocicletaService.obterLista();
	}

}
