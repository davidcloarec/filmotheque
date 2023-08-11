package fr.eni.filmotheque.dal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.eni.filmotheque.bo.Opinion;

@Repository
public class OpinionDAOImpl implements OpinionDAO {

	List<Opinion> opinions;
	
	
	@Override
	public void insertOpinion(Opinion opinion) {
		opinions= new ArrayList<Opinion>();
	
		
		
	}

}
