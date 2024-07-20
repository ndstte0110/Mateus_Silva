package fatec183.projetobase.servico;

import org.springframework.stereotype.Service;

import fatec183.projetobase.interfaces.IServico;
import fatec183.projetobase.model.Contato;
import fatec183.projetobase.repositorio.ContatoRepositorio;

@Service
public class ContatoServico implements IServico<Contato, Long> {
    ContatoRepositorio cor;

    public ContatoServico(ContatoRepositorio cor) {
        this.cor = cor;
    }

    @Override
    public Contato salvar(Contato objeto) {
        return cor.save(objeto);
    }

    public Object listarTodos() {
        return cor.findAll();
    }
}
