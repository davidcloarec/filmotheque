package fr.eni.filmotheque.ihm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.filmotheque.bll.FilmService;
import fr.eni.filmotheque.bo.Member;
import fr.eni.filmotheque.bo.Movie;
import fr.eni.filmotheque.bo.Opinion;
import fr.eni.filmotheque.bo.Participant;
import fr.eni.filmotheque.bo.Type;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FilmController {
	
	private FilmService filmService;
	
	public FilmController(FilmService filmService) {
		super();
		this.filmService = filmService;
	}
	
	
	@GetMapping({"/", "/accueil"})
	public String afficherAccueil(Model model) {
		model.addAttribute("movies", this.filmService.findMovies());
		return "listeFilm";
	}
	
	
	@GetMapping("/details")
	public String afficherdetails(@RequestParam(required = false) int id, Model model) {
		
		model.addAttribute("movie", this.filmService.findById(id));
		
		return "detailsFilm";
	}
       

    @GetMapping("/ajout")
    public String afficherFormulaireFilm() {

        return "ajoutFilm";

    }
    
    @PostMapping("/ajout")
    public String ajouterFilm(Movie movie, Model model) {
    	
    	this.filmService.add(movie);
    	model.addAttribute("movies", this.filmService.findMovies());
        return "redirect:/accueil";

    }
	
}
