package br.edu.infnet.repository;
import br.edu.infnet.modelo.Produto;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
    
    List<Produto> findByNomeIgnoreCaseContaining(String nome);
    
}
