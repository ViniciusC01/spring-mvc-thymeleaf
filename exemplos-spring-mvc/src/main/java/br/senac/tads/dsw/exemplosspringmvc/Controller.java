package br.senac.tads.dsw.exemplosspringmvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@RequestMapping("/exemplo")
public class Controller {



    @GetMapping("/curriculo")
    public ModelAndView curriculo() {

        ModelAndView mv = new ModelAndView("dados");

        mv.addObject("nome", "Vinicius Carvalho Rodrigues");
        mv.addObject("email", "vinicius.crodrigue1@senacsp.edu.br");
        mv.addObject("nascimento", "20/12/2001");
        mv.addObject("linkedin", "https://www.linkedin.com/in/viniciusc-/");
        mv.addObject("gitHub", "https://github.com/ViniciusC01");
        return mv;

    }
}
