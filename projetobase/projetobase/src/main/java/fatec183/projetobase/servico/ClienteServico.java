package fatec183.projetobase.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fatec183.projetobase.interfaces.IServico;
import fatec183.projetobase.model.Cliente;
import fatec183.projetobase.repositorio.ClienteRepositorio;

@Service
public class ClienteServico implements IServico<Cliente, Long> {
    ClienteRepositorio cr;

    public ClienteServico(ClienteRepositorio cr) {
        this.cr = cr;
    }

    @Override
    public Cliente salvar(Cliente objeto) {
        return cr.save(objeto);
    }

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public List<Cliente> listarTodos() {
        return clienteRepositorio.findAll();

    }
}
