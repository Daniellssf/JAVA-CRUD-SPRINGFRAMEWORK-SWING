package br.edu.infnet.repository;
import br.edu.infnet.modelo.Fornecedor;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends CrudRepository<Fornecedor, Integer>{
    
     List<Fornecedor> findByNomeIgnoreCaseContaining(String nome);
    
}
