package fr.eni.filmotheque.bll;

import java.util.List;

import fr.eni.filmotheque.bo.Movie;

public interface FilmService {

	public List<Movie> findMovies();

	public void add(Movie movie);

	public Movie findById(int id);
	

}
