package fr.eni.filmotheque.bo;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	
	private int id;
	private String title;
	private int releaseDate;
	private int duration;
	private String synopsis;
	private Participant director;
	private Type type;
	private List<Participant> actors = new ArrayList<Participant>();
	private List<Opinion> opinions = new ArrayList<Opinion>();
	
	public Movie(int id, String title, int releaseDate, int duration, String synopsis, Participant director,
			List<Participant> actors, Type type) {
		super();
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
		this.duration = duration;
		this.synopsis = synopsis;
		this.director = director;
		this.actors = actors;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Participant getDirector() {
		return director;
	}

	public void setDirector(Participant director) {
		this.director = director;
	}

	public List<Participant> getActors() {
		return actors;
	}

	public void setActors(List<Participant> actors) {
		this.actors = actors;
	}
	
	public void addActor(Participant actor) {
		actors.add(actor);
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public List<Opinion> getOpinions() {
		return opinions;
	}

	public void setOpinions(List<Opinion> opinions) {
		this.opinions = opinions;
	}
	
	public void addOpinion(Opinion opinion) {
		opinions.add(opinion);
	}
	

}
