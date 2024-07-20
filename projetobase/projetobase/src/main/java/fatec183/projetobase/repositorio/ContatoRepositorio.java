package fatec183.projetobase.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fatec183.projetobase.model.Contato;
@Repository

public interface ContatoRepositorio extends JpaRepository<Contato,Long>{

}
