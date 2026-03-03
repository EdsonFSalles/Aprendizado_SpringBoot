package br.com.Aula001.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	
	@GetMapping
	private String By() {
		return "Volte sempre!";
	}
	@RequestMapping(method = RequestMethod.GET, path = "/Olá")
	private String ola(){
		return "Olá Mundo!";
	}
}
