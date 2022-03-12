package br.edu.infnet.apiusuario.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apiusuario.domain.model.Endereco;
import br.edu.infnet.apiusuario.domain.model.Usuario;
import br.edu.infnet.apiusuario.domain.service.UsuarioService;

@Component
@Order(1)
public class UsuarioLoader implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuario = new Usuario();
		usuario.setEmail("wallacereislima@gmail.com");
		usuario.setNome("Wallace lima");
		usuario.setSenha("123456");
		usuario.setAdmin(true);
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua de teste");
		endereco.setLocalidade("Localidade de teste");
		endereco.setBairro("Bairro de teste");
		endereco.setUf("RJ");
		endereco.setComplemento("Complemento teste");
		endereco.setCep("25035-090");
		usuario.setEndereco(endereco);
		
		usuarioService.incluir(usuario);
		
	}
}