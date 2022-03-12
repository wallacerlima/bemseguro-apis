package br.edu.infnet.apisegurado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiSeguradoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSeguradoApplication.class, args);
	}

}
