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

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FilmController {

	Participant director = new Participant(1, "jean", "dupont");
	List<Participant> actors = new ArrayList<Participant>(); 
	List<Movie> movies = new ArrayList<Movie>();
	Type type1 = new Type(1, "horreur");
	Type type2 = new Type(2, "comedie");
	Type type3 = new Type(3, "drame");
	Member member = new Member(1, "jean", "charles", "visiteur@gmail.fr", "azerty1234", false);
	Member member2 = new Member(1, "jean", "edouard", "visiteur2@gmail.fr", "azerty1234", false);
	
	
	public FilmController() {
		actors.add(new Participant(1, "jean", "paul"));
		actors.add(new Participant(2, "jean", "pierre"));		
		movies.add(new Movie(1, "film1", 1990, 90, 
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
				+ "Suspendisse interdum sapien vel neque aliquet interdum. "
				+ "Ut blandit faucibus dolor nec pharetra. Aliquam tempus mattis urna sit amet egestas.", 
				director, actors, type1));
		movies.add(new Movie(2, "film2", 2000, 100, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
				+ "Suspendisse interdum sapien vel neque aliquet interdum. Ut blandit faucibus dolor nec pharetra. "
				+ "Aliquam tempus mattis urna sit amet egestas.", director, actors, type2));
		movies.add(new Movie(3, "film3", 2010, 110, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
				+ "Suspendisse interdum sapien vel neque aliquet interdum. Ut blandit faucibus dolor nec pharetra. "
				+ "Aliquam tempus mattis urna sit amet egestas.", director, actors, type3));
		movies.get(0).addOpinion(new Opinion(1, "c'est pas mal", 4, member, movies.get(0)));
		movies.get(0).addOpinion(new Opinion(2, "c'est nul", 1, member2, movies.get(0)));
		movies.get(1).addOpinion(new Opinion(3, "TROP BIEN", 5, member, movies.get(1)));
		movies.get(1).addOpinion(new Opinion(4, "j'aime pas", 1, member2, movies.get(1)));
		movies.get(2).addOpinion(new Opinion(5, "pas compris", 2, member, movies.get(2)));
		movies.get(2).addOpinion(new Opinion(6, "c'etait mieux avant", 3, member2, movies.get(2)));
	}
	
	
	@GetMapping({"/", "/accueil"})
	public String afficherAccueil(Model model) {
		model.addAttribute("movies",movies);
		return "listeFilm";
	}
	
	
	@GetMapping("/details")
	public String afficherdetails(@RequestParam(required = false) int id, Model model) {
		for (Movie movie : movies) {
			if(movie.getId() == id) {
				model.addAttribute("movie",movie);
				break;
			}
		}
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
