package fatec183.projetobase.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fatec183.projetobase.model.Cliente;
@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente,Long>{

}
