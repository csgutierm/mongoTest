package com.csgutierm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//podemos testear en el navegador usando un Restcontroller y un Get Mapping
//@RestController
public class ApiCartasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCartasApplication.class, args);
	}
	
	//testeo
//	@GetMapping("/root")
//	public String apiRoot() {
//		return "Hello, World";
//	}

}
