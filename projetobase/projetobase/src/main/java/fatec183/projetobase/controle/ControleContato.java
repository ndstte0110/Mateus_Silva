package fatec183.projetobase.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fatec183.projetobase.interfaces.IControle;
import fatec183.projetobase.model.Contato;
import fatec183.projetobase.servico.ClienteServico;
import fatec183.projetobase.servico.ContatoServico;

@Controller
@RequestMapping("/contato")
public class ControleContato implements IControle<Contato, Long> {
    private ContatoServico cos;
    private ClienteServico cs;

    public ControleContato(ContatoServico cos, ClienteServico cs) {
        this.cos = cos;
        this.cs = cs;
    }

    @GetMapping()
    @Override
    public ModelAndView listarTodos() {
        ModelAndView mv = new ModelAndView("/contato/index.html");
        mv.addObject("contato", cos.listarTodos());
        return mv;
    }

    @GetMapping("/novo")
    @Override
    public ModelAndView inserir() {
        ModelAndView mv = new ModelAndView("/contato/novo.html");
        mv.addObject("contato", new Contato());
        mv.addObject("cliente", cs.listarTodos());
        return mv;
    }

    @PostMapping("/novo")
    @Override
    public ModelAndView inserir(Contato objeto) {
        objeto = cos.salvar(objeto);
        return new ModelAndView("redirect:/contato");
    }
}
