package com.exampl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringClienteApplication implements CommandLineRunner {

	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(SpringClienteApplication.class);
	    app.run(args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		RestTemplate plantilla = new RestTemplate();
		String resultado = plantilla.getForObject("http://localhost:8080/api/calculadora/sumar",String.class);
		System.out.println(resultado);
		
	}

}
