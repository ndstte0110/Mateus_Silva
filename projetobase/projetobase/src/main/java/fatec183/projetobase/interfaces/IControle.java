package fatec183.projetobase.interfaces;

import org.springframework.web.servlet.ModelAndView;

public interface IControle <T,K>{

    public ModelAndView listarTodos();

    public ModelAndView inserir();

    public ModelAndView inserir(T objeto);

}
