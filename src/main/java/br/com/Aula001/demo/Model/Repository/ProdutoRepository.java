package br.com.Aula001.demo.Model.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.Aula001.demo.Model.entities.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
// Interface para extender os metodos CRUD
}
