package fr.eni.filmotheque.bo;

public class Opinion {
	
	private int id;
	private String opinion;
	private int rating;
	private Member member;
	private Movie movie;
	
	
	public Opinion(int id, String opinion, int rating, Member member, Movie movie) {
		this.id = id;
		this.opinion = opinion;
		this.rating = rating;
		this.movie = movie;
		this.member = member;
		member.addOpinion(this);
		
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getOpinion() {
		return opinion;
	}


	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public Member getMember() {
		return member;
	}


	public void setMember(Member member) {
		this.member = member;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	

}
