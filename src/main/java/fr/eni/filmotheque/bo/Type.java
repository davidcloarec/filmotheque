package fr.eni.filmotheque.bo;

import java.util.ArrayList;
import java.util.List;

public class Type {
	
	private int id;
	private String label;
	private List<Movie> movies = new ArrayList<Movie>();
	
	
	public Type(int id, String label) {
		super();
		this.id = id;
		this.label = label;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public List<Movie> getMovies() {
		return movies;
	}


	public void addMovie(Movie movie) {
		movies.add(movie);
	}
	
	
	
	
	

}
