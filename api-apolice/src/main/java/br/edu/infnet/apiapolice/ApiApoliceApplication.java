package br.edu.infnet.apiapolice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiApoliceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApoliceApplication.class, args);
	}

}
