package fatec183.projetobase.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ControlePrincipal {
    @GetMapping("")
    public String getMethodName() {
        return "index.html";
    }
}
