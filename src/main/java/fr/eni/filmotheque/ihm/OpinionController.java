package fr.eni.filmotheque.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.filmotheque.bll.OpinionService;
import fr.eni.filmotheque.bo.Opinion;

@Controller
public class OpinionController {
	
	private OpinionService opinionService;
	
	@Autowired
	public OpinionController(OpinionService opinionService) {
		this.opinionService = opinionService;
	}

	@GetMapping("/opinion")
	public String afficherOpinion( Model model) {
		return "opinion";
	}
	
	@PostMapping("/accueil")
	public String traitFormulaire(Opinion opinion, Model modele) {
		
		return "";
	}
	

}
