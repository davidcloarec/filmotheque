package fr.eni.filmotheque.bo;

import java.util.ArrayList;
import java.util.List;

public class Member {
	
	private int id;
	private String firsname;
	private String lastname;
	private String email;
	private String password;
	private boolean isAdmin;
	private List<Opinion> opinions = new ArrayList<Opinion>();
	
	
	public Member(int id, String firsname, String lastname, String email, String password, boolean isAdmin) {
		this.id = id;
		this.firsname = firsname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.isAdmin = isAdmin;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirsname() {
		return firsname;
	}


	public void setFirsname(String firsname) {
		this.firsname = firsname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isAdmin() {
		return isAdmin;
	}


	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}


	public List<Opinion> getOpinions() {
		return opinions;
	}
	
	public void addOpinion(Opinion opinion) {
		opinions.add(opinion);
	}

}
