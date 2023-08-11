package fr.eni.filmotheque.dal;

import java.util.List;

import fr.eni.filmotheque.bo.Movie;

public interface FilmDAO {

	public List<Movie> selectAllMovies();

	public void insertMovie(Movie movie);

	public Movie selectById(int id);


}
