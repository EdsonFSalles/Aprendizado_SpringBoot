package br.com.Aula001.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.Aula001.demo.Model.entities.Clientes;


@RestController
@RequestMapping(path = "/cliente")
public class Cliente {
	
	@GetMapping(path = "/qualquer")
	public Clientes obterCliente() {
		
		return new Clientes(28, "Souza", "000.111.222-33");
	}
	
	@GetMapping("/{Id}") // com valor direto usando ' / '
	public Clientes obterClienteId1(@PathVariable  int Id) {
		return new Clientes(Id, "Zoro", "666.666.666.33");
	}
	
	@GetMapping
	public Clientes obterClienteId2(@RequestParam(name = "Id", defaultValue = "1") int Id) {
		return new Clientes(Id, "Luffy", "777.777.777.34");
	}
	

}
