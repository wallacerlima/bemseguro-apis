package br.edu.infnet.apisegurado.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apisegurado.domain.model.Segurado;
import br.edu.infnet.apisegurado.domain.model.Usuario;
import br.edu.infnet.apisegurado.domain.service.SeguradoService;

@Component
@Order(2)
public class SeguradoLoader implements ApplicationRunner {

	@Autowired
	private SeguradoService seguradoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Segurado segurado1 = new Segurado("Jorge Santos", "12345678912", "jorge.santos@gmail.com");
		segurado1.setUsuario(usuario);
		seguradoService.incluir(segurado1);
		
		Segurado segurado2 = new Segurado("Maria Pereira", "01258965412", "maria.pereira@gmail.com");
		segurado2.setUsuario(usuario);
		seguradoService.incluir(segurado2);
		
	}
}