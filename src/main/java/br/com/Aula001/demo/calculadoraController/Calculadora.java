package br.com.Aula001.demo.calculadoraController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculadora")
public class Calculadora {

	@GetMapping("/somar/{x}/{y}")
	public int somar(@PathVariable int x, @PathVariable int y) {
		return x + y;
	}

	
	//o metodo subtrair pode ser chamado direto passado
	//os parametros ....? x= valor & y= valor
	@GetMapping
	public int subtrair(
			@RequestParam(name = "x", defaultValue = "0") int x,
			@RequestParam(name = "y", defaultValue = "0") int y) {
		return x - y;
	}

}
