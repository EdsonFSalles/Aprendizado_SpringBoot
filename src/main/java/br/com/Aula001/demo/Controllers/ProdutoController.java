package br.com.Aula001.demo.Controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.Aula001.demo.Model.Repository.ProdutoRepository;
import br.com.Aula001.demo.Model.entities.Produto;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository ProdutoRepository;
	
//	@PostMapping
//	public @ResponseBody Produto novoProduto(
//			//Existe o uso do (@RequestParam String nome, @RequestParam double valor, @RequestParam double desconto)
//			// ou usando
//			@Valid Produto produto	) {
//		ProdutoRepository.save(produto);
//		return produto;
//	}
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		ProdutoRepository.save(produto);
		return produto;
	}
	
	@GetMapping
	public Iterable<Produto> obterTodos(){
		return ProdutoRepository.findAll();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Produto> obterPorID(@PathVariable  int id){
		return ProdutoRepository.findById(id);
	}
	
	@PutMapping
	public Produto alterarProduto(@Valid Produto produto) {
		ProdutoRepository.save(produto);
		return produto;
	}
	
	
	
	
}
