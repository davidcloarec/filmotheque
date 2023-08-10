package fr.eni.filmotheque.ihm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.filmotheque.bo.Member;
import fr.eni.filmotheque.bo.Movie;
import fr.eni.filmotheque.bo.Opinion;
import fr.eni.filmotheque.bo.Participant;
import fr.eni.filmotheque.bo.Type;

@Controller
public class FilmController {
	
//	Participant director = new Participant(1, "jean", "dupont");
//	List<Participant> actors = new ArrayList<Participant>(); 
//	List<Movie> movies = new ArrayList<Movie>();
//	Type type1 = new Type(1, "horreur");
//	Type type2 = new Type(2, "comedie");
//	Type type3 = new Type(3, "drame");
//	Member member = new Member(1, "visiteur", "visiteur", "visiteur@gmail.fr", "azerty1234", false);
	
//	
//	public FilmController() {
//		actors.add(new Participant(1, "jean", "paul"));
//		actors.add(new Participant(2, "jean", "pierre"));		
//		movies.add(new Movie(1, "film1", 1990, 90, "c'est bien", director, actors, type1));
//		movies.add(new Movie(2, "film2", 2000, 100, "c'est moins bien", director, actors, type2));
//		movies.add(new Movie(3, "film3", 2010, 110, "c'est nul", director, actors, type3));
//		movies.get(1).addOpinion(new Opinion(1, "c'est pas mal", 5, member, movies.get(1)));
//	}
	
	
	@GetMapping({"/", "/accueil"})
	public String afficherAccueil() {
		return "listeFilm";
	}
	
	
	@GetMapping("/details")
	public String afficherdetails(@RequestParam(required = false) int id, Model model) {
		
		//model.addAttribute("movie", movies.get(id));
		return "detailsFilm";
	}
	
	
	@GetMapping("/ajout")
	public String ajouterFilm() {
		return "ajoutFilm";
	}

}
