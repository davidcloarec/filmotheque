package fr.eni.filmotheque.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Opinion;
import fr.eni.filmotheque.dal.OpinionDAO;

@Service
public class OpinionServiceImpl implements OpinionService{

	private OpinionDAO opinionDAO;
	
	@Autowired
	public OpinionServiceImpl(OpinionDAO opinionDAO) {
		this.opinionDAO = opinionDAO;
	}

	@Override
	public void addOpinion(Opinion opinion) {
		this.opinionDAO.insertOpinion(opinion);
		
	}

}
