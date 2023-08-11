package fr.eni.filmotheque.bll;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Movie;
import fr.eni.filmotheque.dal.FilmDAO;

@Service
public class FilmServiceImpl implements FilmService{

	private FilmDAO filmDAO;
	
	public FilmServiceImpl(FilmDAO filmDAO) {
		super();
		this.filmDAO = filmDAO;
	}

	@Override
	public List<Movie> findMovies() {
		return this.filmDAO.selectAllMovies();
	}

	@Override
	public void add(Movie movie) {
		this.filmDAO.insertMovie(movie);		
	}

	@Override
	public Movie findById(int id) {
		return this.filmDAO.selectById(id);
	}

}
