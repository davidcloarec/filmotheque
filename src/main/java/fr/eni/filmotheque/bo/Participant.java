package fr.eni.filmotheque.bo;

import java.util.List;

public class Participant {
	
	private int id;
	private String firstname;
	private String lastname;
	private List<Movie> movies;
	
	
	public Participant(int id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public List<Movie> getMovies() {
		return movies;
	}


	public void addMovie(Movie movie) {
		movies.add(movie);
	}
	
	
	

}
