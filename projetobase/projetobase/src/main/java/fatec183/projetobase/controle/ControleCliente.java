package fatec183.projetobase.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import fatec183.projetobase.interfaces.IControle;
import fatec183.projetobase.model.Cliente;
import fatec183.projetobase.servico.ClienteServico;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ControleCliente implements IControle<Cliente, Long> {
    private ClienteServico cs;

    public ControleCliente(ClienteServico cs) {
        this.cs = cs;
    }

    @GetMapping()
    @Override
    public ModelAndView listarTodos() {
        ModelAndView mv = new ModelAndView("/cliente/index.html");
        mv.addObject("cliente", cs.listarTodos());
        return mv;

    }

    @GetMapping("/novo")
    @Override
    public ModelAndView inserir() {
        ModelAndView mv = new ModelAndView("/cliente/novo.html");
        mv.addObject("cliente", new Cliente());
        return mv;
    }

    @PostMapping("/novo")
    @Override
    public ModelAndView inserir(Cliente objeto) {
        objeto = cs.salvar(objeto);
        return new ModelAndView("redirect:/cliente");
    }
}
