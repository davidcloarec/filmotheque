package fr.eni.filmotheque.ihm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FilmController {
	
	@GetMapping({"/", "/accueil"})

    public String afficherAccueil() {

        return "listeFilm";

    }   
   
    @GetMapping("/details")

    public String afficherdetails() {

        return "detailsFilm";

    }
       

    @GetMapping("/ajout")

    public String afficherFormulaireFilm() {

        return "ajoutFilm";

    }
    
    @PostMapping("/ajout")
    public String ajouterFilm() {
        return "redirect:/accueil";

    }
	
}
