package br.senac.tads.dsw.exemplosspringmvc;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RestController("/exemplo")
public class ControllerCurriculo {
	
	@GetMapping("/exemplo-view-obj")
	public ModelAndView exemploViewObj() {
	 ModelAndView mv = new ModelAndView("view-exemplo");
	 mv.addObject("texto", "Texto gerado no Controller v2");
	 mv.addObject("numero", 100);
	 mv.addObject("dataHora"
	, LocalDateTime.now());
	 return mv;
	}

	
	
	@GetMapping("/mensagem2")
	public ModelAndView saudar2() {
	return new ModelAndView("mensagem-view");
	}


}
