package br.com.Aula001.demo.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/metodos")
public class metodosHttpsController {
	
	@GetMapping
	public String get() {
		return "Requisição do tipo GET";
	}
	
	@PostMapping
	public String post() {
		return "Requisição do tipo POST";
	}
	
	@PutMapping
	public String put() {
		return "Requisição do tipo PUT";
	}
	
	@PatchMapping
	public String patch() {
		return "Requisição do tipo PATCH";
	}
	
	@DeleteMapping
	public String delete() {
		return "Requisição do tipo DELETE";
	}
}
