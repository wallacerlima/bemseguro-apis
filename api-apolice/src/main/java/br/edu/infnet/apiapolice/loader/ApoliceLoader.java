package br.edu.infnet.apiapolice.loader;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apiapolice.domain.model.Apolice;
import br.edu.infnet.apiapolice.domain.model.Caminhao;
import br.edu.infnet.apiapolice.domain.model.Carro;
import br.edu.infnet.apiapolice.domain.model.Motocicleta;
import br.edu.infnet.apiapolice.domain.model.Segurado;
import br.edu.infnet.apiapolice.domain.model.Usuario;
import br.edu.infnet.apiapolice.domain.model.Veiculo;
import br.edu.infnet.apiapolice.domain.service.ApoliceService;

@Component
@Order(4)
public class ApoliceLoader implements ApplicationRunner {

	@Autowired
	private ApoliceService apoliceService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Segurado segurado = new Segurado();
		segurado.setId(1);
		
		Carro carro = new Carro();
		carro.setId(1);
		
		Motocicleta motocicleta = new Motocicleta();
		motocicleta.setId(2);
		
		Caminhao caminhao = new Caminhao();
		caminhao.setId(3);
		
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		veiculos.add(carro);
		veiculos.add(motocicleta);
		veiculos.add(caminhao);
		
		
		Apolice apolice = new Apolice();
		apolice.setNumApolice("12345678910");
		apolice.setData(LocalDateTime.now());
		apolice.setTipo("Tradicional");
		apolice.setUsuario(usuario);
		apolice.setItensSegurados(veiculos);
		apolice.setSegurado(segurado);
		
		apoliceService.incluir(apolice);
	
	}
}