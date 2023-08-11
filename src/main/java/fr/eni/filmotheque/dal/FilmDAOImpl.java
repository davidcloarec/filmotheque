package fr.eni.filmotheque.dal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.eni.filmotheque.bo.Member;
import fr.eni.filmotheque.bo.Movie;
import fr.eni.filmotheque.bo.Opinion;
import fr.eni.filmotheque.bo.Participant;
import fr.eni.filmotheque.bo.Type;

@Repository
public class FilmDAOImpl implements FilmDAO{

	List<Movie> movies;
	
	List<Participant> actors;
		
	
	public FilmDAOImpl() {
		Participant director = new Participant(1, "jean", "dupont");
		actors = new ArrayList<Participant>(); 
		movies = new ArrayList<Movie>();
		Type type1 = new Type(1, "horreur");
		Type type2 = new Type(2, "comedie");
		Type type3 = new Type(3, "drame");
		Member member = new Member(1, "visiteur", "visiteur", "visiteur@gmail.fr", "azerty1234", false);
		actors.add(new Participant(1, "jean", "paul"));
		actors.add(new Participant(2, "jean", "pierre"));		
		movies.add(new Movie(1, "film1", 1990, 90, "c'est bien", director, actors, type1));
		movies.add(new Movie(2, "film2", 2000, 100, "c'est moins bien", director, actors, type2));
		movies.add(new Movie(3, "film3", 2010, 110, "c'est nul", director, actors, type3));
		movies.get(1).addOpinion(new Opinion(1, "c'est pas mal", 5, member, movies.get(1)));
	}

	@Override
	public List<Movie> selectAllMovies() {
		return movies;
	}

	@Override
	public void insertMovie(Movie movie) {
		movies.add(movie);	
	}

	@Override
	public Movie selectById(int id) {
		for (Movie movie : movies) {
			if(movie.getId() == id) {
				return movie;
			}
		}
		return null;
	}

	

}
